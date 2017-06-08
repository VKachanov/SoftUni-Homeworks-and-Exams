using System;

namespace p03ExchangeVariablesValues
{
    class ExchangeVariablesValues
    {
        static void Main(string[] args)
        {
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());

            int temp = a;
            a = b;
            b = temp;

            Console.WriteLine($"{a}\n{b}");
        }
    }
}
