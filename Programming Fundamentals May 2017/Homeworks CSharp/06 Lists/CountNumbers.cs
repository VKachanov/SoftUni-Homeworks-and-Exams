using System;
using System.Collections.Generic;
using System.Linq;

namespace p07_CountNumbers
{
    class CountNumbers
    {
        static void Main(string[] args)
        {
            List<int> inputList = Console.ReadLine().Split(' ').Select(int.Parse).ToList();

            int[] occurenceCount = new int[inputList.Max() + 1];

            foreach (int num in inputList)
            {
                occurenceCount[num]++;
            }
                
            for (int i = 0; i < occurenceCount.Length; i++)
            {
                if (occurenceCount[i] > 0)
                    Console.WriteLine($"{i} -> {occurenceCount[i]}");
            }
        }
    }
}
