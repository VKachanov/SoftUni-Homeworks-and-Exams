using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SchoolCamp
{
    class Program
    {
        static void Main(string[] args)
        {
            string season = Console.ReadLine().ToLower();
            string groupType = Console.ReadLine().ToLower();
            int pupilsCount = int.Parse(Console.ReadLine());
            int nightsCount = int.Parse(Console.ReadLine());

            string sportType = "";
            double price = 0;

            switch (season)
            {
                case "winter":
                    switch (groupType)
                    {
                        case "girls":
                            sportType = "Gymnastics";
                            price = pupilsCount * nightsCount * 9.60;
                            break;
                        case "boys":
                            sportType = "Judo";
                            price = pupilsCount * nightsCount * 9.60;
                            break;
                        case "mixed":
                            sportType = "Ski";
                            price = pupilsCount * nightsCount * 10.0;
                            break;
                    }
                    break;
                case "spring":
                    switch (groupType)
                    {
                        case "girls":
                            sportType = "Athletics";
                            price = pupilsCount * nightsCount * 7.20;
                            break;
                        case "boys":
                            sportType = "Tennis";
                            price = pupilsCount * nightsCount * 7.20;
                            break;
                        case "mixed":
                            sportType = "Cycling";
                            price = pupilsCount * nightsCount * 9.50;
                            break;
                    }
                    break;
                case "summer":
                    switch (groupType)
                    {
                        case "girls":
                            sportType = "Volleyball";
                            price = pupilsCount * nightsCount * 15.0;
                            break;
                        case "boys":
                            sportType = "Football";
                            price = pupilsCount * nightsCount * 15.0;
                            break;
                        case "mixed":
                            sportType = "Swimming";
                            price = pupilsCount * nightsCount * 20.0;
                            break;
                    }
                    break;
            }
            if (pupilsCount >= 10 && pupilsCount < 20)
            {
                price = price - price * 5.0 / 100;
            }
            else if (pupilsCount >= 20 && pupilsCount < 50)
            {
                price = price - price * 15.0 / 100;
            }
            else if (pupilsCount >= 50)
            {
                price = price - price * 50 / 100;
            }
            Console.WriteLine("{0} {1:f2} lv.", sportType, price);
        }
    }
}
