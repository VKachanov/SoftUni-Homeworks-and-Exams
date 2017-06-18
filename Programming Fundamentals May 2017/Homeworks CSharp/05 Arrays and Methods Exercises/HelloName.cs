using System;

namespace p01_HelloName
{
    class HelloName
    {
        static void Main(string[] args)
        {
            string inputName = Console.ReadLine();

            AddName(inputName);
        }

        static void AddName(string name)
        {
            Console.WriteLine($"Hello, {name}!");
        }
    }
}
