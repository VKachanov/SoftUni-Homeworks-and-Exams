using System;

namespace p08SumOfOddNumbers
{
    class SumOfOddNumbers
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            int sum = 0;

            for (int i = 1; i <= n; i++)
            {
                int nextOdd = 2 * i - 1;
                Console.WriteLine(nextOdd);
                sum += nextOdd;
            }
            Console.WriteLine("Sum: " + sum);
        }
    }
}
