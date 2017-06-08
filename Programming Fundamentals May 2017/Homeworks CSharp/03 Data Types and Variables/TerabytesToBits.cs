using System;

namespace p07TerabytesToBits
{
    class TerabytesToBits
    {
        static void Main(string[] args)
        {
            double terabytes = double.Parse(Console.ReadLine());

            decimal bits = (decimal)terabytes * 1024 * 1024 * 1024 * 1024 * 8;

            Console.WriteLine($"{bits:f0}");
        }
    }
}
