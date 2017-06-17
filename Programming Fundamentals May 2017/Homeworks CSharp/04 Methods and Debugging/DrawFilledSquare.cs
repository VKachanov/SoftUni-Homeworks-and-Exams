using System;

namespace p04_DrawFilledSquare
{
    class DrawFilledSquare
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            PrintRepeatingLine(n);
            for (int i = 0; i < n - 2; i++)
            {
                PrintMidLines(n);
            }
            PrintRepeatingLine(n);

        }

        static void PrintRepeatingLine(int width)
        {
            Console.WriteLine(new string('-', 2 * width));
        }

        static void PrintMidLines(int width)
        {
            Console.Write('-');
            for (int i = 1; i < width; i++)
                Console.Write("\\/");
            Console.WriteLine('-');

        }
    }
}
