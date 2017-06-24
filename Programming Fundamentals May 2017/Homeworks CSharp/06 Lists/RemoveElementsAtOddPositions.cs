using System;
using System.Collections.Generic;
using System.Linq;

namespace p01_RemoveElementsAtOddPositions
{
    class RemoveElementsAtOddPositions
    {
        static void Main(string[] args)
        {
            List<string> inputList = Console.ReadLine().Split(' ').ToList();

            List<string> outputList = new List<string>();

            for (int i = 0; i < inputList.Count; i++)
            {
                if (i % 2 != 0)
                {
                    outputList.Add(inputList[i]);
                }
                
            }

            Console.WriteLine(String.Join("", outputList));
        }
    }
}
