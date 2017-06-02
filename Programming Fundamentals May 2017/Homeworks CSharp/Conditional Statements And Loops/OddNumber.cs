using System;

namespace p11OddNumber
{
    class OddNumber
    {
        static void Main(string[] args)
        {
            int number = 0;
            do
            {
                number = int.Parse(Console.ReadLine());

                if (number % 2 != 0)
                {
                    Console.WriteLine($"The number is: {Math.Abs(number)}");
                }
                else
                {
                    Console.WriteLine("Please write an odd number.");
                }
            } while (number % 2 == 0);
        }
    }
}
