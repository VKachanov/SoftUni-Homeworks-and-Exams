using System;

namespace p02_MinMethod
{
    class MinMethod
    {
        static void Main(string[] args)
        {
            double num1 = double.Parse(Console.ReadLine());
            double num2 = double.Parse(Console.ReadLine());
            double num3 = double.Parse(Console.ReadLine());

            double temp = GetMin(num1, num2);
            temp = GetMin(temp, num3);

            Console.WriteLine(temp);
        }

        static double GetMin(double a, double b)
        {
            double temp = a;

            if (a > b)
            {
                temp = b;
            }

            return temp;
        }
    }
}
