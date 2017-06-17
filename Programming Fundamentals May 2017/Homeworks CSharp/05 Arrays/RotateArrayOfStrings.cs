using System;

namespace p04_RotateArrayOfStrings
{
    class RotateArrayOfStrings
    {
        static void Main(string[] args)
        {
            string[] inputArray = Console.ReadLine().Split();
            string[] rotatedArray = new string[inputArray.Length];

            for (int i = 0; i < inputArray.Length - 1; i++)
            {
                rotatedArray[i + 1] = inputArray[i];
            }

            string inputArrLastElement = inputArray[inputArray.Length - 1];
            rotatedArray[0] = inputArrLastElement;

            Console.WriteLine(string.Join(" ", rotatedArray));
        }
    }
}
