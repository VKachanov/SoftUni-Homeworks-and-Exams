using System;
using System.Collections.Generic;
using System.Linq;

namespace p01_RemoveNegativesAndReverse
{
    class RemoveNegativesAndReverse
    {
        static void Main(string[] args)
        {
            List<int> input = Console.ReadLine().Split(' ').Select(int.Parse).ToList();

            List<int> output = new List<int>();

            for (int i = input.Count - 1; i >= 0; i--)
            {
                if (input[i] > 0 )
                {
                    output.Add(input[i]);
                }
            }

            if (output.Count == 0)
            {
                Console.WriteLine("empty");
            }
            else
            {

                Console.WriteLine(string.Join(" ", output));
            }

        }
    }
}
