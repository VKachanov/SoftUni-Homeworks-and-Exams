using System;

namespace p02_ArrayElementsEqualToTheirIndex
{
    class ArrayElementsEqualToTheirIndex
    {
        static void Main(string[] args)
        {
            string[] inputStrings = Console.ReadLine().Split();
            int[] intArray = new int[inputStrings.Length];

            string output  = String.Empty;

            for (int i = 0; i < intArray.Length; i++)
            {
                intArray[i] = int.Parse(inputStrings[i]);
                if (i == intArray[i])
                {
                    output += intArray[i] + " ";
                }
            }

            Console.WriteLine(output);
        }
    }
}
