using System;

namespace p03Megapixels
{
    class Megapixels
    {
        static void Main(string[] args)
        {
            int width = int.Parse(Console.ReadLine());
            int height = int.Parse(Console.ReadLine());

            double resolution = width * height / 1000000.0;

            Console.WriteLine($"{width}x{height} => {Math.Round(resolution, 1)}MP");
        }
    }
}
