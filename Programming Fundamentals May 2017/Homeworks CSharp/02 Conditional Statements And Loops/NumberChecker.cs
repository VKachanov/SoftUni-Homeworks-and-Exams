using System;

namespace p12NumberChecker
{
    class NumberChecker
    {
        static void Main(string[] args)
        {
            try
            {
                double n = double.Parse(Console.ReadLine());
                Console.WriteLine("It is a number.");
            }
            catch (Exception)
            {
                Console.WriteLine("Invalid input!");
            }

        }
    }
}
