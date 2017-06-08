using System;

namespace p17CypherRoulette
{
    class CypherRoulette
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            string finalString = String.Empty;
            string previousString = String.Empty;
            bool reversedString = false;

            for (int i = 0; i < n; i++)
            {
                string entryString = Console.ReadLine();

                bool reversed = entryString.Equals("spin");

                if (previousString == entryString)
                {
                    finalString = String.Empty;

                    if (reversed)
                    {
                        i--;
                    }
                }
                else
                {
                    if (reversed)
                    {
                        reversedString = !reversedString;
                        i--;
                    }
                    else
                    {
                        if (reversedString)
                        {
                            finalString = entryString + finalString;
                        }
                        else
                        {
                            finalString += entryString;
                        }
                    }
                }

                previousString = entryString;
            }
            Console.WriteLine(finalString);
        }
    }
}
