using System;

namespace p02ChooseDrinkTwo
{
    class ChooseDrinkTwo
    {
        static void Main(string[] args)
        {
            string proffesion = Console.ReadLine();
            int quantity = int.Parse(Console.ReadLine());
            double water = 0.70;
            double coffee = 1.00;
            double beer = 1.70;
            double tea = 1.20;
            double totalPrice = 0;
            string drink = String.Empty;

            switch (proffesion)
            {
                case "Athlete":
                    drink = "Water";
                    totalPrice = quantity * water;
                    break;
                case "Businessman":
                case "Businesswoman":
                    drink = "Coffee";
                    totalPrice = quantity * coffee;
                    break;
                case "SoftUni Student":
                    drink = "Beer";
                    totalPrice = quantity * beer;
                    break;
                default:
                    drink = "Tea";
                    totalPrice = quantity * tea;
                    break;
            }
            Console.WriteLine($"The {proffesion} has to pay {totalPrice:f2}.");
        }
    }
}
