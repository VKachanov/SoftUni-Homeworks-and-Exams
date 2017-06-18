using System;

namespace p17_Altitude
{
    class Altitude
    {
        static void Main(string[] args)
        {
            string[] inputArray = Console.ReadLine().Split(' ');

            long altitude = long.Parse(inputArray[0]);

            for (int i = 1; i < inputArray.Length; i++)
            {
                if (i % 2 != 0 && inputArray[i] == "up")
                {
                    altitude += long.Parse(inputArray[i + 1]);

                }
                else if (i % 2 != 0 && inputArray[i] == "down")
                {
                    altitude -= long.Parse(inputArray[i + 1]);
                    if (altitude <= 0)
                    {
                        break;
                    }
                }
            }
            Console.WriteLine(altitude <= 0 ? "crashed" : $"got through safely. current altitude: {altitude}m");
        }
    }
}
