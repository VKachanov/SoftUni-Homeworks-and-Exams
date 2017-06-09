using System;

namespace int_p14_IntegerToHexAndBinary
{
    class IntP14IntegerToHexAndBinary
    {
        static void Main(string[] args)
        {
            int inputDecimal = int.Parse(Console.ReadLine());

            string toHexadecimal = Convert.ToString(inputDecimal, 16).ToUpper();

            string toBinary = Convert.ToString(inputDecimal, 2);

            Console.WriteLine($"{toHexadecimal}\n{toBinary}");
        }
    }
}
