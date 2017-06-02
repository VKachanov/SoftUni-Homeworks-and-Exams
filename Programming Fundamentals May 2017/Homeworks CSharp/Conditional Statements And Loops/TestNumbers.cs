using System;

namespace p12TestNumbers
{
    class TestNumbers
    {
        static void Main(string[] args)
        {
            int firstNumber = int.Parse(Console.ReadLine());
            int secondNumber = int.Parse(Console.ReadLine());
            int maxSumBoundary = int.Parse(Console.ReadLine());

            int sum = 0;
            int counter = 0;

            for (int i = firstNumber; i >= 1; i--)
            {
                for (int j = 1; j <= secondNumber; j++)
                {
                    if (sum >= maxSumBoundary)
                    {
                        break;
                    }
                    sum += 3 * (i * j);
                    counter++;
                }
            }
            if (sum >= maxSumBoundary)
            {
                Console.WriteLine($"{counter} combinations");
                Console.WriteLine($"Sum: {sum} >= {maxSumBoundary}");
            }
            else
            {
                Console.WriteLine($"{counter} combinations");
                Console.WriteLine($"Sum: {sum}");
            }
        }
    }
}
