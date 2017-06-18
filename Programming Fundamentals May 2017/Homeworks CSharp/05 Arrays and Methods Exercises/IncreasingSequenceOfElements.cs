using System;

namespace p13_IncreasingSequenceOfElements
{
    class IncreasingSequenceOfElements
    {
        static void Main(string[] args)
        {
            string[] array = Console.ReadLine().Split(' ');
            int[] intArray = new int[array.Length];
            int largestElement = int.MinValue;
            int count = 0;

            for (int i = 0; i < intArray.Length; i++)
            {
                intArray[i] = int.Parse(array[i]);

                if (intArray[i] > largestElement)
                {
                    largestElement = intArray[i];
                    count++;
                }
            }
            Console.WriteLine(count == array.Length ? "Yes" : "No");
        }
    }
}
