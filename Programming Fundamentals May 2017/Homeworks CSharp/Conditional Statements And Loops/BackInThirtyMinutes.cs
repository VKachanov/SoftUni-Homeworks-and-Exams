using System;

namespace p03BackInThirtyMinutes
{
    class BackInThirtyMinutes
    {
        static void Main(string[] args)
        {
            int hours = int.Parse(Console.ReadLine());
            int minutes = int.Parse(Console.ReadLine());

            int initialTotalMinutes = hours * 60 + minutes;
            int timeInThirtyMinutes = initialTotalMinutes + 30;

            int newHours = timeInThirtyMinutes / 60;
            int newMinutes = timeInThirtyMinutes % 60;

            if (newHours >=24)
            {
                newHours = 0;
            }

            Console.WriteLine($"{newHours}:{newMinutes:d2}");
        }
    }
}
