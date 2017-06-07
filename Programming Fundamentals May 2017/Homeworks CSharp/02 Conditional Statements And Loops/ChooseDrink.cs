using System;

namespace p01ChooseDrink
{
    class ChooseDrink
    {
        static void Main(string[] args)
        {
            string proffesion = Console.ReadLine().ToLower();
            string drink = String.Empty;

            switch (proffesion)
            {
                case "athlete":
                    drink = "Water";
                    break;
                case "businessman":
                case "businesswoman":
                    drink = "Coffee";
                    break;
                case "softuni student":
                    drink = "Beer";
                    break;
                default:
                    drink = "Tea";
                    break;
            }
            Console.WriteLine(drink);
        }
    }
}
