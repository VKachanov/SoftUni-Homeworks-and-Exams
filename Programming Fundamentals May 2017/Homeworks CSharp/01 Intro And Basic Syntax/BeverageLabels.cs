using System;

namespace P04BeverageLabels
{
    class Program
    {
        static void Main(string[] args)
        {
            string productName = Console.ReadLine();
            int productVolume = int.Parse(Console.ReadLine());
            int energyPerHundredMl = int.Parse(Console.ReadLine());
            int sugarsPerHundredMl = int.Parse(Console.ReadLine());

            double currentProductEnergy = productVolume * energyPerHundredMl / 100.0;
            double currentProductSugars = productVolume * sugarsPerHundredMl / 100.0;

            Console.WriteLine($"{productVolume}ml {productName}:\n{currentProductEnergy}kcal, {currentProductSugars}g sugars");

        }
    }
}
