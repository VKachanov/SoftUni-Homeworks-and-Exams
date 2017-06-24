using System;

namespace p01_LastThreeConsecutiveEqualStrings
{
    class LastThreeConsecutiveEqualStrings
    {
        static void Main(string[] args)
        {
            string[] inputStrings = Console.ReadLine().Split();

            int counter = 0;

            for (int i = inputStrings.Length - 1; i > 0; i--)
            {
                if (inputStrings[i] == inputStrings[i - 1])
                {
                    counter++;

                    if (counter == 2)
                    {
                        Console.WriteLine($"{inputStrings[i]} {inputStrings[i]} {inputStrings[i]}");
                        return;
                    }
                }
                else
                {
                    counter = 0;
                }
            }
        }
    }
}
