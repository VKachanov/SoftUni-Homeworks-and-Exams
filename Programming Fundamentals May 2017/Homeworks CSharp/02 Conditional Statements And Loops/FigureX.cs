using System;

namespace p01FigureX
{
    class FigureX
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            int sideSpacesCount = 0;

            for (int i = 0; i < n / 2; i++)
            {
                int midSpacesCount = n - 2 - 2 * sideSpacesCount;

                string sideSpaces = new string(' ', sideSpacesCount);
                string midSpaces = new string(' ', midSpacesCount);

                string upperPart = sideSpaces + "x" + midSpaces + "x" + sideSpaces;
                Console.WriteLine(upperPart);

                sideSpacesCount++;
            }

            Console.WriteLine(new string(' ', sideSpacesCount) + "x" + new string(' ', sideSpacesCount));

            sideSpacesCount--;

            for (int i = 0; i < n / 2; i++)
            {
                int midSpacesCount = n - 2 - 2 * sideSpacesCount;

                string sideSpaces = new string(' ', sideSpacesCount);
                string midSpaces = new string(' ', midSpacesCount);

                string upperPart = sideSpaces + "x" + midSpaces + "x" + sideSpaces;
                Console.WriteLine(upperPart);

                sideSpacesCount--;
            }
        }
    }
}
