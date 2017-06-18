using System;

namespace p14_EqualSequenceOfElements
{
    class EqualSequenceOfElements
    {
        static void Main(string[] args)
        {

            string[] array = Console.ReadLine().Split(' ');
            int[] intArray = new int[array.Length];
            
            int count = 0;

            for (int i = 0; i < intArray.Length; i++)
            {
                intArray[i] = int.Parse(array[i]);
                int previousElement = intArray[0];
                if (intArray[i] == previousElement)
                {
                    previousElement = intArray[i];
                    count++;
                }
            }
            Console.WriteLine(count == array.Length ? "Yes" : "No");
        }
    }
}
