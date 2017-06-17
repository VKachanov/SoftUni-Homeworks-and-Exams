using System;
using System.Linq;

namespace p06_OddNumbersAtOddPositions
{
    class OddNumbersAtOddPositions
    {
        static void Main(string[] args)
        {
            string[] inputArray = Console.ReadLine().Split();

            int[] numbersArray = inputArray.Select(int.Parse).ToArray();

            
            for (int i = 0; i < numbersArray.Length; i++)
            {
                if (i % 2 != 0 && numbersArray[i] % 2 != 0)
                {
                    Console.WriteLine($"Index {i} -> {numbersArray[i]}");
                }
               
            }
         }
    }
}
