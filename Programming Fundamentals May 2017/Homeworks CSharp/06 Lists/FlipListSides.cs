using System;
using System.Collections.Generic;
using System.Linq;

namespace p04_FlipListSides
{
    class FlipListSides
    {
        static void Main(string[] args)
        {
            List<int> inputList = Console.ReadLine().Split(' ').Select(int.Parse).ToList();

            int midInputList = inputList.Count / 2;

            for (int i = 1; i < midInputList; i++)
            {
                int temp = inputList[i];

                inputList[i] = inputList[inputList.Count - 1 - i];

                inputList[inputList.Count - 1 - i] = temp;
            }
            Console.WriteLine(string.Join(" ", inputList));
        }
    }
}
