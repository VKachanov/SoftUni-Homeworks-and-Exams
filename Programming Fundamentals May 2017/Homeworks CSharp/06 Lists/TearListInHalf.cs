using System;
using System.Collections.Generic;
using System.Linq;

namespace p05TearListInHalf
{
    class TearListInHalf
    {
        static void Main(string[] args)
        {
            List<int> inputList = Console.ReadLine().Split(' ').Select(int.Parse).ToList();

            List<int> firstHalf = new List<int>();
            List<int> secondHalf = new List<int>();

            for (int i = 0; i < inputList.Count; i++)
            {
                if (i < inputList.Count / 2)
                {
                    firstHalf.Add(inputList[i]);
                }
                else
                {
                    secondHalf.Add(inputList[i]);
                }
            }

            List<int> outputList = new List<int>(inputList.Count + firstHalf.Count);

            for (int i = 0; i < firstHalf.Count; i++)
            {
                outputList.Add(secondHalf[i] / 10);
                outputList.Add(firstHalf[i]);
                outputList.Add(secondHalf[i] % 10);
            }

            Console.WriteLine(String.Join(" ", outputList));
        }
    }
}
