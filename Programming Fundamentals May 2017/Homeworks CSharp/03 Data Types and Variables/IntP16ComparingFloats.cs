using System;

namespace int_p16_ComparingFloats
{
    class IntP16ComparingFloats
    {
        static void Main(string[] args)
        {
            const float eps = 0.000001f;

            double firstNumber = double.Parse(Console.ReadLine());
            double secondNumber = double.Parse(Console.ReadLine());

            double diference = Math.Abs(firstNumber - secondNumber);

            bool areEqual = !(diference >= eps);

            Console.WriteLine(areEqual);
        }
    }
}
