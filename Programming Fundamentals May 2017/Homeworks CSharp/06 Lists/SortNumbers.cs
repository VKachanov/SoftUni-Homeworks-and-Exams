using System;
using System.Collections.Generic;
using System.Linq;

namespace p05_SortNumbers
{
    class SortNumbers
    {
        static void Main(string[] args)
        {
            List<double> inpuList = Console.ReadLine().Split(' ').Select(double.Parse).ToList();

            inpuList.Sort();

            Console.WriteLine(String.Join(" <= ", inpuList));

        }
    }
}
