using System;

namespace p11_CountOfGivenElement
{
    class CountOfGivenElement
    {
        static void Main(string[] args)
        {

            string[] array = Console.ReadLine().Split(' ');
            string givenElement = Console.ReadLine();

            int count = 0;

            for (int i = 0; i < array.Length; i++)
            {
                if (array[i] == givenElement)
                {
                    count++;
                }
            }

            Console.WriteLine(count);
        }
    }
}
