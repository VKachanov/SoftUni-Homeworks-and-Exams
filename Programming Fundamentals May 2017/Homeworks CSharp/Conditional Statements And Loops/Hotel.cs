using System;

namespace p04Hotel
{
    class Hotel
    {
        static void Main(string[] args)
        {
            string month = Console.ReadLine().ToLower();
            int nightsCount = int.Parse(Console.ReadLine());

            double studioPrice = 0;
            double doublePrice = 0;
            double suitePrice = 0;

            switch (month)
            {
                case "may":
                case "october":
                    studioPrice = 50.0;
                    doublePrice = 65.0;
                    suitePrice = 75.0;
                    if (nightsCount > 7)
                    {
                        studioPrice = studioPrice - studioPrice * 5.0 / 100;
                    }
                    break;
                case "june":
                case "september":
                    studioPrice = 60.0;
                    doublePrice = 72.0;
                    suitePrice = 82.0;
                    if (nightsCount > 14)
                    {
                        doublePrice = doublePrice - doublePrice * 10.0 / 100;
                    }
                    break;
                case "july":
                case "august":
                case "december":
                    studioPrice = 68.0;
                    doublePrice = 77.0;
                    suitePrice = 89.0;
                    if (nightsCount > 14)
                    {
                        suitePrice = suitePrice - suitePrice * 15.0 / 100;
                    }
                    break;
            }
            double totalStudioPrice = studioPrice * nightsCount;
            double totalDoublePrice = doublePrice * nightsCount;
            double totalSuitePrice = suitePrice * nightsCount;

            if (nightsCount > 7 && (month == "september" || month == "october"))
            {
                totalStudioPrice = studioPrice * (nightsCount - 1);
            }

            Console.WriteLine($"Studio: {totalStudioPrice:f2} lv.");
            Console.WriteLine($"Double: {totalDoublePrice:f2} lv.");
            Console.WriteLine($"Suite: {totalSuitePrice:f2} lv.");
        }
    }
}
