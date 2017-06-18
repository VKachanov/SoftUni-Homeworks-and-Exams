using System;

namespace p16_ArraySymetry
{
    class ArraySymetry
    {
        static void Main(string[] args)
        {
            string[] array = Console.ReadLine().Split(' ');

            bool symetric = true;

            for (int i = 0; i <= (array.Length - 1) / 2; i++)
            {
                if (array[i] != array[array.Length - 1 - i])
                {
                    symetric = false;
                    break;
                }
            }
            Console.WriteLine(symetric ? "Yes" : "No");
        }
    }
}
