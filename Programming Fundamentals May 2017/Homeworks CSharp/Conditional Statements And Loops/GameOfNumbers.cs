using System;

namespace p13GameOfNumbers
{
    class GameOfNumbers
    {
        static void Main(string[] args)
        {
            int firstNumber = int.Parse(Console.ReadLine());
            int secondNumber = int.Parse(Console.ReadLine());
            int magicNumber = int.Parse(Console.ReadLine());

            int combinations = 0;
            int sum = 0;
            int lastFirstNumber = 0;
            int lastSecondNumber = 0;
            bool equalsMagicNumber = false;

            for (int i = firstNumber; i <= secondNumber; i++)
            {
                for (int j = firstNumber; j <= secondNumber; j++)
                {
                    sum = i + j;
                    combinations++;
                    if (sum == magicNumber)
                    {
                        
                        lastFirstNumber = i;
                        lastSecondNumber = j;
                        equalsMagicNumber = true;
                    }
                }
            }
            if (equalsMagicNumber)
            {
                Console.WriteLine($"Number found! {lastFirstNumber} + {lastSecondNumber} = {magicNumber}");
            }
            else
            {
                Console.WriteLine($"{combinations} combinations - neither equals {magicNumber}");
            }
        }
    }
}
