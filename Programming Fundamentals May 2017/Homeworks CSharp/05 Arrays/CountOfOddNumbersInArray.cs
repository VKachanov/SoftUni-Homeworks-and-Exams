using System;
using System.Linq;

namespace p05_CountOfOddNumbersInArray
{
    class CountOfOddNumbersInArray
    {
        static void Main(string[] args)
        {
            string[] inputArray = Console.ReadLine().Split();

            int[] numbersArray = inputArray.Select(int.Parse).ToArray();

            int count = 0;

            for (int i = 0; i < numbersArray.Length; i++)
            {
                if (numbersArray[i] % 2 != 0)
                {
                    count++;
                }
            }
            Console.WriteLine(count);
        }
    }
}
