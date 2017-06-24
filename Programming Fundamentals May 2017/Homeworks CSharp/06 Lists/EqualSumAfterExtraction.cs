using System;
using System.Collections.Generic;
using System.Linq;

namespace p03EqualSumAfterExtraction
{
    class EqualSumAfterExtraction
    {
        static void Main(string[] args)
        {
            List<int> firstList = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            List<int> secondList = Console.ReadLine().Split(' ').Select(int.Parse).ToList();

            for (int i = 0; i < firstList.Count; i++)
            {
                for (int j = 0; j < secondList.Count; j++)
                {
                    if (firstList[i] == secondList[j])
                    {
                        secondList.RemoveAt(j);
                        j--;
                    }
                }
            }

            int firstListSum = firstList.Sum();
            int secondListSum = 0;

            for (int i = 0; i < secondList.Count; i++)
            {
                secondListSum += secondList[i];
            }

            int diff = firstListSum - secondListSum;

            if (diff == 0)
            {
                Console.WriteLine($"Yes. Sum: {firstListSum}");
            }
            else
            {
                Console.WriteLine($"No. Diff: {Math.Abs(diff)}");
            }
        }

    }
}
