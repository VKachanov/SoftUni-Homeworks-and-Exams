﻿using System;

namespace p03ExactSumOfRealNumbers
{
    class ExactSumOfRealNumbers
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            decimal sum = 0;

            for (int i = 0; i < n; i++)

                sum += decimal.Parse(Console.ReadLine());

            Console.WriteLine(sum);
        }
    }
}