using System;

namespace p05_IntegerToBase
{
    class IntegerToBase
    {
        static void Main(string[] args)
        {
            int number = int.Parse(Console.ReadLine());
            int toBase = int.Parse(Console.ReadLine());

            Console.WriteLine(ConvertIntegerToBase(number, toBase));

        }

        static string ConvertIntegerToBase(int num, int toBase)
        {
            string result = String.Empty;

            while (num > 0)
            {
                
                int currentNum = num % toBase;
                result = currentNum + result;
                
                num = num / toBase;
            }

            return result;
        }
    }
}
