using System;

namespace p08SMSTyping
{
    class SMSTyping
    {
        static void Main(string[] args)
        {
            int numberOfCharacters = int.Parse(Console.ReadLine());

            for (int i = 0; i < numberOfCharacters; i++)
            {
                int entryNumber = int.Parse(Console.ReadLine());

                char currentCharacter;
                string smsText = string.Empty;

                if (entryNumber == 0)
                {
                    currentCharacter = ' ';
                }
                else
                {

                    string entryToString = entryNumber.ToString();
                    int digitsCount = entryToString.Length;

                    int mainDigit = entryNumber;
                    if (digitsCount == 4)
                    {
                        mainDigit = entryNumber / 1000;
                    }
                    else if (digitsCount == 3)
                    {
                        mainDigit = entryNumber / 100;
                    }
                    else if (digitsCount == 2)
                    {
                        mainDigit = entryNumber / 10;
                    }

                    int offset = (mainDigit - 2) * 3;

                    if (mainDigit == 8 || mainDigit == 9)
                    {
                        offset++;
                    }

                    int letterIndex = offset + digitsCount - 1;

                    currentCharacter = (char)(97 + letterIndex);
                }
                smsText += currentCharacter;
                
                Console.Write(smsText);
            }
        }
    }
}
