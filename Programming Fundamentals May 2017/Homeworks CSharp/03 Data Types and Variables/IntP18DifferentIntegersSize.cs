using System;

namespace int_p18_DifferentIntegersSize
{
    class IntP18DifferentIntegersSize
    {
        static void Main(string[] args)
        {
            long num;
            string inputString = Console.ReadLine();
            var canFitInBigInteger = long.TryParse(inputString, out num);

            if (!canFitInBigInteger)
            {
                Console.WriteLine($"{inputString} can't fit in any type");
                return;
            }
            else
            {
                Console.WriteLine($"{num} can fit in:");

                if (num >= sbyte.MinValue && num <= sbyte.MaxValue)
                {
                    Console.WriteLine("* sbyte");
                }
                if (num >= byte.MinValue && num <= byte.MaxValue)
                {
                    Console.WriteLine("* byte");
                }
                if (num >= short.MinValue && num <= short.MaxValue)
                {
                    Console.WriteLine("* short");
                }
                if (num >= ushort.MinValue && num <= ushort.MaxValue)
                {
                    Console.WriteLine("* ushort");
                }
                if (num >= int.MinValue && num <= int.MaxValue)
                {
                    Console.WriteLine("* int");
                }
                if (num >= uint.MinValue && num <= uint.MaxValue)
                {
                    Console.WriteLine("* uint");
                }

                Console.WriteLine("* long");

            }
        }
    }
}
