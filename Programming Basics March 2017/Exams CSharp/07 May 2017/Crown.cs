using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Crown
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            int width = 2 * n - 1;
            int height = n / 2 + 4;

            // Top Row
            int topRowSpacesCount = (width - 3) / 2;
            string topRowSpaces = new string(' ', topRowSpacesCount);
            string topRow = "@" + topRowSpaces + "@" + topRowSpaces + "@";
            Console.WriteLine(topRow);

            // Second Row
            topRowSpacesCount--;
            string secondRowSpaces = new string(' ', topRowSpacesCount);
            string secondRow = "**" + secondRowSpaces + "*" + secondRowSpaces + "**";
            Console.WriteLine(secondRow);

            //Cycle body
            int cycleLength = height - 6;
            int cycleLeftRightDotsCount = 1;
            topRowSpacesCount-=2;

            for (int i = 0; i < cycleLength; i++)
            {
                int cycleMidDotsCount = width - 6 - 2 * cycleLeftRightDotsCount - 2 * topRowSpacesCount;
                string cycleLeftRightDots = new string('.', cycleLeftRightDotsCount);
                string cycleSpaces = new string(' ', topRowSpacesCount);
                string cycleMidDots = new string('.', cycleMidDotsCount);
                string cycle = "*" + cycleLeftRightDots + "*" + cycleSpaces + "*" + cycleMidDots + "*"
                    + cycleSpaces + "*" + cycleLeftRightDots + "*";
                Console.WriteLine(cycle);

                cycleLeftRightDotsCount++;
                topRowSpacesCount-=2;
            }

            //First Row After Cycle
            int firstAfterCycleMidDotsCount = width - 6 - 2 * cycleLeftRightDotsCount - 2 * topRowSpacesCount;
            string firstAfterCycle = "*" + new string('.', cycleLeftRightDotsCount) + "*"
                + new string('.', firstAfterCycleMidDotsCount) + "*" + new string('.', cycleLeftRightDotsCount)
                + "*";
            Console.WriteLine(firstAfterCycle);

            //Second Row After Cycle
            cycleLeftRightDotsCount++;
            string secondAfterCycleMidAsterisks = new string('*', cycleLength);
            string secondAfterCycle = "*" + new string('.', cycleLeftRightDotsCount)
                + secondAfterCycleMidAsterisks + "." + secondAfterCycleMidAsterisks
                + new string('.', cycleLeftRightDotsCount) + "*";
            Console.WriteLine(secondAfterCycle);

            //Last Two Rows
            string lastTwoRows = new string('*', width);
            Console.WriteLine(lastTwoRows);
            Console.WriteLine(lastTwoRows);
        }
    }
}
