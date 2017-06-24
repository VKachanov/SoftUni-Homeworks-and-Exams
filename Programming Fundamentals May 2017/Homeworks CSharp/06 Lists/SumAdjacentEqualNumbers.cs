using System;
using System.Collections.Generic;
using System.Linq;

namespace p03_SumAdjacentEqualNumbers
{
    class SumAdjacentEqualNumbers
    {
        static void Main(string[] args)
        {
            List<double> input = Console.ReadLine().Split(' ').Select(double.Parse).ToList();

            for (int i = 1; i < input.Count; i++)
            {
                if (input[i - 1] == input[i])
                {
                    input[i - 1] += input[i];
                    input.RemoveAt(i);

                    i = 0;
                }
            }
            Console.WriteLine(String.Join(" ", input));
        }
    }
}
