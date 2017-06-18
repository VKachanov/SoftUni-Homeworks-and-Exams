using System;


namespace p15_CountOfCapitalLetters
{
    class CountOfCapitalLetters
    {
        static void Main(string[] args)
        {
            string[] array = Console.ReadLine().Split(' ');
            
            int count = 0;

            foreach (string currentString in array)
            {
                if (currentString.Length == 1)
                {
                    char character = currentString[0];

                    if (character >= 'A' && character <= 'Z')
                    {
                        count++;
                    }
                }
            }
            Console.WriteLine(count);
        }
    }
}
