using System;
using System.Collections.Generic;
using System.Linq;

namespace p07_StuckZipper
{
    class StuckZipper
    {
        static void Main(string[] args)
        {
            List<int> firstList = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            List<int> secondList = Console.ReadLine().Split(' ').Select(int.Parse).ToList();

            int minNumberLength = FindSmallestDigitCount(firstList, secondList);

            List<int> filteredFirstList = new List<int>();
            List<int> filteredSecondList = new List<int>();

            foreach (int number in firstList)
            {
                if (FindDigitsCount(number) <= minNumberLength)
                {
                    filteredFirstList.Add(number);
                }
            }

            foreach (int number in secondList)
            {
                if (FindDigitsCount(number) <= minNumberLength)
                {
                    filteredSecondList.Add(number);
                }
            }

            List<int> outputList = new List<int>();

            for (int i = 0; i < Math.Max(filteredFirstList.Count, filteredSecondList.Count); i++)
            {
                if (i < filteredSecondList.Count)
                {
                    outputList.Add(filteredSecondList[i]);
                }
                if (i < filteredFirstList.Count)
                {
                    outputList.Add(filteredFirstList[i]);
                }
            }

            Console.WriteLine(String.Join(" ", outputList));
        }

        private static int FindDigitsCount(int number)
        {
            int digitsCount = 0;
            number = Math.Abs(number);

            while (number > 0)
            {
                digitsCount++;

                number /= 10;

            }

            return digitsCount;
        }

        private static int FindSmallestDigitCount(List<int> list1, List<int> list2)
        {
            int minLengthNumber = int.MaxValue;

            for (int i = 0; i < list1.Count; i++)
            {
                if (minLengthNumber > FindDigitsCount(list1[i]))
                {
                    minLengthNumber = FindDigitsCount(list1[i]);
                }
            }

            for (int i = 0; i < list2.Count; i++)
            {
                if (minLengthNumber > FindDigitsCount(list2[i]))
                {
                    minLengthNumber = FindDigitsCount(list2[i]);
                }
            }

            return minLengthNumber;
        }
    }
}
