using System;

namespace ToyShop
{
    class Program
    {
        static void Main(string[] args)
        {
            double neededBudget = double.Parse(Console.ReadLine());
            int puzzleCount = int.Parse(Console.ReadLine());
            int dollsCount = int.Parse(Console.ReadLine());
            int stuffedBearsCount = int.Parse(Console.ReadLine());
            int minionsCount = int.Parse(Console.ReadLine());
            int toyTrucksCount = int.Parse(Console.ReadLine());

            double moneyEarnedBeforeTax = puzzleCount * 2.60 + dollsCount * 3.0 + stuffedBearsCount * 4.10
                + minionsCount * 8.20 + toyTrucksCount * 2.0;

            int totalToysCount = puzzleCount + dollsCount + stuffedBearsCount + minionsCount + toyTrucksCount;

            if (totalToysCount >= 50)
            {
                moneyEarnedBeforeTax = moneyEarnedBeforeTax - moneyEarnedBeforeTax * 25.0 / 100;
            }

            double moneyAfterTax = moneyEarnedBeforeTax - moneyEarnedBeforeTax * 10.0 / 100;

            double diff = neededBudget - moneyAfterTax;

            if (diff <= 0)
            {
                Console.WriteLine("Yes! {0:f2} lv left.", Math.Abs(diff));
            }
            else
            {
                Console.WriteLine("Not enough money! {0:f2} lv needed.", diff);
            }
        }
    }
}
