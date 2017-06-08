using System;

namespace p04FloatOrInteger
{
    class FloatOrInteger
    {
        static void Main(string[] args)
        {
            double number = double.Parse(Console.ReadLine());

            if (number % 1 == 0)
            {
                Console.WriteLine(number);
            }
            else
            {
                Console.WriteLine(Math.Round(number));
            }

        }
    }
}
