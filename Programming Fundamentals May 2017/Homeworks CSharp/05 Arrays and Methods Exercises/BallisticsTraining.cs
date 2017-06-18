using System;
using System.Linq;

namespace p18_BallisticsTraining
{
    class BallisticsTraining
    {
        static void Main(string[] args)
        {
            string[] planeCoordinates = Console.ReadLine().Split(' ');
            int[] intCoordinates = planeCoordinates.Select(int.Parse).ToArray();

            string[] commandsSequence = Console.ReadLine().Split(' ');

            int[] result = new int[2];

            for (int i = 0; i < commandsSequence.Length; i++)
            {
                if (commandsSequence[i] == "up")
                {
                    result[1] += int.Parse(commandsSequence[i + 1]);
                }
                else if (commandsSequence[i] == "down")
                {
                    result[1] -= int.Parse(commandsSequence[i + 1]);
                }
                else if (commandsSequence[i] == "left")
                {
                    result[0] -= int.Parse(commandsSequence[i + 1]);
                }
                else if (commandsSequence[i] == "right")
                {
                    result[0] += int.Parse(commandsSequence[i + 1]);
                }
            }

            if (intCoordinates[0] == result[0] && intCoordinates[1] == result[1])
            {
                Console.WriteLine("firing at [{0}, {1}]", result[0], result[1]);
                Console.WriteLine("got 'em!");
            }
            else
            {
                Console.WriteLine("firing at [{0}, {1}]", result[0], result[1]);
                Console.WriteLine("better luck next time...");
            }
        }
    }
}
