using System;

namespace p03RestaurantDiscount
{
    class RestaurantDiscount
    {
        static void Main(string[] args)
        {
            int groupSize = int.Parse(Console.ReadLine());
            string packageType = Console.ReadLine().ToLower();

            string hall = "";
            int price = 0;

            if (groupSize <= 50)
            {
                hall = "Small Hall";
                price = 2500;
            }
            else if (groupSize <= 100)
            {
                hall = "Terrace";
                price = 5000;
            }
            else if (groupSize <= 120)
            {
                hall = "Great Hall";
                price = 7500;
            }

            double totalPrice = 0;

            switch (packageType)
            {
                case "normal":
                    price += 500;
                    totalPrice = price - price * 5.0 / 100;
                    break;
                case "gold":
                    price += 750;
                    totalPrice = price - price * 10.0 / 100;
                    break;
                case "platinum":
                    price += 1000;
                    totalPrice = price - price * 15.0 / 100;
                    break;
            }

            if (hall == "")
            {
                Console.WriteLine("We do not have an appropriate hall.");
            }
            else
            {
                double pricePerPerson = totalPrice / groupSize;

                Console.WriteLine($"We can offer you the {hall}");
                Console.WriteLine($"The price per person is {pricePerPerson:f2}$");
            }
           
        }
    }
}
