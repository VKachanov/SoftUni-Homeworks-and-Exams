using System;

namespace p01SumArrayElements
{
    class SumArrayElements
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            int[] arrOfIntegers = new int[n];
            int sum = 0;

            for (int i = 0; i < arrOfIntegers.Length; i++)
            {
                arrOfIntegers[i] = int.Parse(Console.ReadLine());
                sum += arrOfIntegers[i];
            }
            Console.WriteLine(sum);
        }
    }
}
