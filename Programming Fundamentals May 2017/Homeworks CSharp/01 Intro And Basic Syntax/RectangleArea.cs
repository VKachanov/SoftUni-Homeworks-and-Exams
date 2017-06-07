using System;

namespace P02RectangleArea
{
    class Program
    {
        static void Main(string[] args)
        {
            double rectangleWidth = double.Parse(Console.ReadLine());
            double rectangleHeight = double.Parse(Console.ReadLine());

            double rectangleArea = rectangleHeight * rectangleWidth;

            Console.WriteLine("{0:f2}", rectangleArea);
        }
    }
}
