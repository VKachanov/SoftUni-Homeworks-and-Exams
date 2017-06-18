using System;

namespace p04_NthDigit
{
    class NthDigit
    {
        static void Main(string[] args)
        {
            long inputNumber = long.Parse(Console.ReadLine());
            int index = int.Parse(Console.ReadLine());

            Console.WriteLine(FindNthDigit(inputNumber, index));

        }

        static int FindNthDigit(long number, int index)
        {
            int auxIndex = 0;
            int neededDigit = 0;

            while (auxIndex < index)
            {
                
                int currentDigit = (int) number % 10;
                auxIndex++;
                if (auxIndex == index)
                {
                    neededDigit = currentDigit;
                }
  
                number /= 10;
               
            }

            return neededDigit;
        }

    }
}
