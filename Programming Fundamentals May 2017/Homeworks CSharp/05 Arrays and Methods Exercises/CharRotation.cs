using System;
using System.Linq;

namespace p05_CharRotation
{
    class CharRotation
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            string[] intArray = Console.ReadLine().Split();

            char[] inputChars = input.ToCharArray();
            int[] integers = intArray.Select(int.Parse).ToArray();

            string output = String.Empty;
            
            for (int i = 0; i < integers.Length; i++)
            {
                output += GetCharacter(integers[i], inputChars[i]);
            }
            Console.WriteLine(output);
        }

        static char GetCharacter(int number, char character)
        {
            int newNum = 0;

            if (number % 2 == 0)
            {
                newNum = number - character;
            }
            else
            {
                newNum = number + character;
            }

            return (char) Math.Abs(newNum);
        }
    }
}
