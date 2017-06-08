using System;

namespace p12HexadecimalFormat
{
    class HexadecimalFormat
    {
        static void Main(string[] args)
        {
            string hexadecimalInput = Console.ReadLine();

            Console.WriteLine(Convert.ToInt32(hexadecimalInput, 16)); 
        }
    }
}
