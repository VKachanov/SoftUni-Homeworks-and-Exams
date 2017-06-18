using System;

namespace p10_CountOfNegativeElements
{
    class CountOfNegativeElements
    {
        static void Main(string[] args)
        {

            int n = int.Parse(Console.ReadLine());
            int[] array = new int[n];
            int negativesCount = 0;

            for (int i = 0; i < n; i++)
            {
                array[i] = int.Parse(Console.ReadLine());

                if (array[i] < 0)
                {
                    negativesCount++;
                }
            }

            Console.WriteLine(negativesCount);
        }
    }
}
