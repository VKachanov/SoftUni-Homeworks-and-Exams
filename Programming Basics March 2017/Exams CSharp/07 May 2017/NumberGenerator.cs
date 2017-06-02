using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NumberGenerator
{
    class Program
    {
        static void Main(string[] args)
        {
            int m = int.Parse(Console.ReadLine());
            int n = int.Parse(Console.ReadLine());
            int l = int.Parse(Console.ReadLine());
            int specialNumber = int.Parse(Console.ReadLine());
            int controlNumber = int.Parse(Console.ReadLine());

            int realNumber = m * 100 + n * 10 + l;

            for (int i = realNumber; i >= 111; i--)
            {
                if (specialNumber >= controlNumber)
                {
                    Console.WriteLine($"Yes! Control number was reached! Current special number is {specialNumber}.");
                    return;
                }
                if (i % 3 == 0)
                {
                    specialNumber += 5;
                }
                else if (i % 10 == 5)
                {
                    specialNumber -= 2;
                }
                else if (i % 2 == 0)
                {
                    specialNumber *= 2;
                }
            }
            Console.WriteLine($"No! {specialNumber} is the last reached special number.");
        }
    }
}