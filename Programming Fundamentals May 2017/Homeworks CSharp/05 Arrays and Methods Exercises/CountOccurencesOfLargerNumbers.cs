using System;

namespace p12_CountOccurencesOfLargerNumbers
{
    class CountOccurencesOfLargerNumbers
    {
        static void Main(string[] args)
        {
            string[] array = Console.ReadLine().Split(' ');
            double p = double.Parse(Console.ReadLine());
            double[] doubArr = new double[array.Length];
            int count = 0;

            for (int i = 0; i < doubArr.Length; i++)
            {
                doubArr[i] = double.Parse(array[i]);

                if (doubArr[i] > p)
                {
                    count++;
                }
            }

            Console.WriteLine(count);
        }
    }
}
