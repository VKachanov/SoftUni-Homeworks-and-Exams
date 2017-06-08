using System;

namespace p05DistanceOfTheStars
{
    class DistanceOfTheStars
    {
        static void Main(string[] args)
        {
            decimal lightYear = 9450000000000m;

            decimal distanceToProxima = lightYear * 4.22m;
            decimal distanceToGalaxyCenter = lightYear * 26000;
            decimal galaxyDiameter = lightYear * 100000;
            decimal distanceToEndUniverse = lightYear * 46500000000;

            Console.WriteLine($"{distanceToProxima:e2}\n{distanceToGalaxyCenter:e2}\n{galaxyDiameter:e2}\n{distanceToEndUniverse:e2}");
        }
    }
}
