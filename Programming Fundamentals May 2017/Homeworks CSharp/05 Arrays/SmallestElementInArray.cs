using System;
using System.Runtime.Remoting.Metadata.W3cXsd2001;

namespace p03_SmallestElementInArray
{
    class SmallestElementInArray
    {
        static void Main(string[] args)
        {
            string[] inputStrArr = Console.ReadLine().Split();
            int[] intArray = new int[inputStrArr.Length];

            int min = int.MaxValue;

            for (int i = 0; i < intArray.Length; i++)
            {
                intArray[i] = int.Parse(inputStrArr[i]);
                
                if (intArray[i] < min)
                {
                    min = intArray[i];
                }
            }
            Console.WriteLine(min);
        }
    }
}
