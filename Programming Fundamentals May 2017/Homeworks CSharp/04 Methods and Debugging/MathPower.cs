using System;

namespace p06_MathPower
{
    class MathPower
    {
        static void Main(string[] args)
        {
            double number = double.Parse(Console.ReadLine());
            int power = int.Parse(Console.ReadLine());

            Console.WriteLine(GetPower(number, power));
        }

        static double GetPower(double number, int power)
        {
            double result = number;
            for (int i = 0; i < power - 1; i++)
            {
                result *= number;
            }

            return result;
        }
    }
}
