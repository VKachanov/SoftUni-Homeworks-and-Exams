using System;

namespace p08_StringEncryption
{
    class StringEncryption
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            string finalString = String.Empty;

            for (int i = 0; i < n; i++)
            {
                char letter = char.Parse(Console.ReadLine());
   
                finalString += Encrypt(letter);
            }
            Console.WriteLine(finalString);
        }

        private static string Encrypt(char letter)
        {
            int asciiLetter = (int) letter;
            int firstDigit = 0;
            int secondDigit = 0;
            int thirdDigit = 0;

            while (asciiLetter > 0)
            {
                thirdDigit = asciiLetter % 10;
                asciiLetter /= 10;
                secondDigit = asciiLetter % 10;
                asciiLetter /= 10;
                firstDigit = asciiLetter;
                asciiLetter /= 10;
            }

            asciiLetter = (int) letter;
            string appendedDigits = String.Empty;
            string output = String.Empty;

            if (asciiLetter / 100 > 0)
            {
                appendedDigits = "" + firstDigit + thirdDigit;
                output = (char) (asciiLetter + thirdDigit) + appendedDigits + (char) (asciiLetter - firstDigit);
            }else if (asciiLetter / 10 > 0)
            {
                appendedDigits = "" + secondDigit + thirdDigit;
                output = (char)(asciiLetter + thirdDigit) + appendedDigits + (char)(asciiLetter - secondDigit);
            }

            return output;
        }
    }
}
