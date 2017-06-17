using System;

namespace p02_MultiplyArrayOfDoubles
{
    class MultiplyArrayOfDoubles
    {
        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split(' ');
            double p = double.Parse(Console.ReadLine());
            double[] inputDoubles = new double[input.Length];

            for (int i = 0; i < inputDoubles.Length; i++)
            {
                inputDoubles[i] = double.Parse(input[i]);
                
                inputDoubles[i] *= p;

                Console.Write(inputDoubles[i] + " ");
            }
        }
    }
}
