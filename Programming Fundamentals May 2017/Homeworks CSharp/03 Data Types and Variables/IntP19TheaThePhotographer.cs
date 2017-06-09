using System;

namespace int_p19_TheaThePhotographer
{
    class IntP19TheaThePhotographer
    {
        static void Main(string[] args)
        {
            int picturesTaken = int.Parse(Console.ReadLine());
            int secondsForFiltering = int.Parse(Console.ReadLine());
            int percentGoodPictures = int.Parse(Console.ReadLine());
            int uploadSecondsPerPicture = int.Parse(Console.ReadLine());

            var filteringTimeSeconds = (long)picturesTaken * secondsForFiltering;
            var goodPictures = (long) Math.Ceiling(picturesTaken * percentGoodPictures / 100.0);
            var totalWorkSeconds = filteringTimeSeconds + goodPictures * uploadSecondsPerPicture;

            //int minutes = (int)(totalWorkSeconds / 60);
            //totalWorkSeconds %= 60;
            //int hours = minutes / 60;
            //minutes %= 60;
            //int days = hours / 24;
            //hours %= 60;

            var workTimeSpan = TimeSpan.FromSeconds(totalWorkSeconds);
            Console.WriteLine($"{workTimeSpan:d\\:hh\\:mm\\:ss}");
            //Console.WriteLine($"{days}:{hours:d2}:{minutes:d2}:{totalWorkSeconds:d2}");
        }
    }
}
