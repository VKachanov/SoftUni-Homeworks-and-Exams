using System;

namespace p04PhotoGallery
{
    class PhotoGallery
    {
        static void Main(string[] args)
        {
            int photoNumber = int.Parse(Console.ReadLine());
            int day = int.Parse(Console.ReadLine());
            int month = int.Parse(Console.ReadLine());
            int year = int.Parse(Console.ReadLine());
            int hours = int.Parse(Console.ReadLine());
            int minutes = int.Parse(Console.ReadLine());
            double size = double.Parse(Console.ReadLine());
            int width = int.Parse(Console.ReadLine());
            int height = int.Parse(Console.ReadLine());

            Console.WriteLine($"Name: DSC_{photoNumber:d4}.jpg");
            Console.WriteLine($"Date Taken: {day:d2}/{month:d2}/{year:d2} {hours:d2}:{minutes:d2}");


            if (size < 1000)
            {
                Console.WriteLine($"Size: {size}B");
            }
            else if (size < 1000000)
            {
                size /= 1000;
                Console.WriteLine($"Size: {size}KB");
            }
            else 
            {
                size /= 1000000;
                Console.WriteLine($"Size: {size}MB");
            }

            string orientation = string.Empty;

            if (width > height)
            {
                orientation = "landscape";
            }
            else if (width == height)
            {
                orientation = "square";
            }
            else if (width < height)
            {
                orientation = "portrait";
            }
           
            Console.WriteLine($"Resolution: {width}x{height} ({orientation})");
        }
    }
}
