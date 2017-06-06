using System;

namespace p02VaporStore
{
    class VaporStore
    {
        static void Main(string[] args)
        {
            double initialBudget = double.Parse(Console.ReadLine());
            string gameName = Console.ReadLine();

            double intermediateBudget = initialBudget;

            double outfallPrice = 39.99;
            double csogPrice = 15.99;
            double splinterPrice = 19.99;
            double honoredPrice = 59.99;
            double roverPrice = 29.99;
            double originsEditionPrice = 39.99;

            double currentPrice = 0;
            double moneySpent = 0;

            while (gameName != "Game Time")
            {
                bool isFound = true;
                switch (gameName)
                {
                    case "OutFall 4":

                        currentPrice = outfallPrice;
                        break;
                    case "CS: OG":

                        currentPrice = csogPrice;
                        break;
                    case "Zplinter Zell":

                        currentPrice = splinterPrice;
                        break;
                    case "Honored 2":
                        currentPrice = honoredPrice;
                        break;
                    case "RoverWatch":

                        currentPrice = roverPrice;
                        break;
                    case "RoverWatch Origins Edition":

                        currentPrice = originsEditionPrice;
                        break;
                    default:
                        Console.WriteLine("Not Found");
                        gameName = Console.ReadLine();
                        isFound = false;
                        break;
                }

                if (!isFound)
                {
                    continue;
                }

                if (currentPrice > intermediateBudget)
                {
                    Console.WriteLine("Too Expensive");
                }
                else
                {
                    intermediateBudget -= currentPrice;
                    moneySpent += currentPrice;
                    Console.WriteLine($"Bought {gameName}");
                }
                if (intermediateBudget == 0)
                {
                    Console.WriteLine("Out of money!");
                    return;
                }

                gameName = Console.ReadLine();
            }
            Console.WriteLine($"Total spent: ${moneySpent:f2}. Remaining: ${(initialBudget - moneySpent):f2}");
        }
    }
}
