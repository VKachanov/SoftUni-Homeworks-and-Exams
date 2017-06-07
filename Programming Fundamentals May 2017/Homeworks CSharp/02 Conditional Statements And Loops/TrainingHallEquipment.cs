using System;

namespace p07TrainingHallEquipment
{
    class TrainingHallEquipment
    {
        static void Main(string[] args)
        {
            double budget = double.Parse(Console.ReadLine());
            int numberOfItems = int.Parse(Console.ReadLine());

            double subtotal = 0.0;

            for (int i = 0; i < numberOfItems; i++)
            {
                string itemName = Console.ReadLine();
                double itemPrice = double.Parse(Console.ReadLine());
                double itemCount = double.Parse(Console.ReadLine());

                if (itemCount > 1)
                {
                    itemName += "s";
                }
                Console.WriteLine($"Adding {itemCount} {itemName} to cart.");

                subtotal += (itemPrice * itemCount);
            }

            if (budget >= subtotal)
            {
                Console.WriteLine($"Subtotal: ${subtotal:f2}\nMoney left: ${(budget - subtotal):f2}");
            }
            else
            {
                Console.WriteLine($"Subtotal: ${subtotal:f2}\nNot enough. We need ${(subtotal - budget):f2} more.");
            }
            
        }
    }
}
