using System;

namespace p09_LargestElementInArray
{
    class LargestElementInArray
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] array = new int[n];
            int largestElement = int.MinValue;

            for (int i = 0; i < n; i++)
            {
                array[i] = int.Parse(Console.ReadLine());

                if (array[i] > largestElement)
                {
                    largestElement = array[i];
                }
            }

            Console.WriteLine(largestElement);
        }
    }
}
