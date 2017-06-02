using System;

namespace P03MilesToKilometers
{
    class Program
    {
        static void Main(string[] args)
        {
            double distanceInMiles = double.Parse(Console.ReadLine());

            double distanceInKilometers = distanceInMiles * 1.60934;

            Console.WriteLine($"{distanceInKilometers:f2}");
        }
    }
}
