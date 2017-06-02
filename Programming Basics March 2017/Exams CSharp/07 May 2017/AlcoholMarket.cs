using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AlcoholMarket
{
    class Program
    {
        static void Main(string[] args)
        {
            double whiskeyPrice = double.Parse(Console.ReadLine());
            double beerQuantity = double.Parse(Console.ReadLine());
            double wineQuantity = double.Parse(Console.ReadLine());
            double rakiaQuantity = double.Parse(Console.ReadLine());
            double whiskeyQuantity = double.Parse(Console.ReadLine());

            double rakiaPrice = whiskeyPrice / 2;
            double winePrice = rakiaPrice - rakiaPrice * 40.0 / 100;
            double beerPrice = rakiaPrice - rakiaPrice * 80.0 / 100;

            double neededBudget = whiskeyPrice * whiskeyQuantity + beerPrice * beerQuantity + winePrice * wineQuantity
                + rakiaPrice * rakiaQuantity;

            Console.WriteLine("{0:f2}", neededBudget);
        }
    }
}
