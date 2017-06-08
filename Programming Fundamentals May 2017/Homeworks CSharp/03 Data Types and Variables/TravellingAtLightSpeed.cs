using System;

namespace p08TravellingAtLightSpeed
{
    class TravellingAtLightSpeed
    {
        static void Main(string[] args)
        {
            decimal lightYear = 9450000000000;
            decimal lightSpeed = 300000; 

            decimal lightYearsCount = decimal.Parse(Console.ReadLine());

            decimal travelSeconds = (lightYearsCount * lightYear) / lightSpeed;

            int travelMinutes = (int) (travelSeconds / 60);
            travelSeconds %= 60;

            int travelHours = travelMinutes / 60;
            travelMinutes %= 60;

            int travelDays = travelHours / 24;
            travelHours %= 24;

            int travelWeeks = travelDays / 7;
            travelDays %= 7;

            Console.WriteLine("{0} weeks", travelWeeks);
            Console.WriteLine("{0} days", travelDays);
            Console.WriteLine("{0} hours", travelHours);
            Console.WriteLine("{0} minutes", travelMinutes);
            Console.WriteLine("{0} seconds", (int)travelSeconds);
        }
    }
}
