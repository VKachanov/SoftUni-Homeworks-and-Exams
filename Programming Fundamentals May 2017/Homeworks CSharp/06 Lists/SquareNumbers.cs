using System;
using System.Collections.Generic;
using System.Linq;

namespace p06_SquareNumbers
{
    class SquareNumbers
    {
        static void Main(string[] args)
        {
            List<int> inpuList = Console.ReadLine().Split(' ').Select(int.Parse).ToList();

            List<int> outputList = new List<int>();

            for (int i = 0; i < inpuList.Count; i++)
            {
                if (Math.Sqrt(inpuList[i]) % 1 == 0)
                {
                    outputList.Add(inpuList[i]);
                }
            }

            outputList.Sort();
            outputList.Reverse();

            Console.WriteLine(String.Join(" ", outputList));
        }
    }
}
