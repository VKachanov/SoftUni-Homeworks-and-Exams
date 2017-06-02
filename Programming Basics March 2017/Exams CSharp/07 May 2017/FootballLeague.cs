using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FootballLeague
{
    class Program
    {
        static void Main(string[] args)
        {
            int stadiumCapacity = int.Parse(Console.ReadLine());
            int fansCount = int.Parse(Console.ReadLine());

            int sectorA = 0;
            int sectorB = 0;
            int sectorV = 0;
            int sectorG = 0;

            for (int i = 0; i < fansCount; i++)
            {
                char[] sector = Console.ReadLine().ToLower().ToCharArray();

                switch (sector[0])
                {
                    case 'a':
                        sectorA++;
                        break;
                    case 'b':
                        sectorB++;
                        break;
                    case 'v':
                        sectorV++;
                        break;
                    case 'g':
                        sectorG++;
                        break;
                }
            }
            Console.WriteLine("{0:f2}%", (double)sectorA / fansCount * 100.0);
            Console.WriteLine("{0:f2}%", (double)sectorB / fansCount * 100.0);
            Console.WriteLine("{0:f2}%", (double)sectorV / fansCount * 100.0);
            Console.WriteLine("{0:f2}%", (double)sectorG / fansCount * 100.0);
            Console.WriteLine("{0:f2}%", (double)fansCount / stadiumCapacity * 100.0);
        }
    }
}
