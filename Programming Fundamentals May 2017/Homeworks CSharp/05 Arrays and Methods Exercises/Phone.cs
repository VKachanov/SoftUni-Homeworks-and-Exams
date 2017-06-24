using System;

namespace p04_Phone
{
    class Phone
    {
        static void Main(string[] args)
        {
            string[] phoneNumbersArray = Console.ReadLine().Split(' ');
            string[] namesArray = Console.ReadLine().Split(' ');

            int[] phoneNumbersInts = new int[phoneNumbersArray.Length];

            string inputNames = Console.ReadLine();

            while (inputNames != "done")
            {

                for (int i = 0; i < phoneNumbersArray.Length; i++)
                {

                    if (inputNames == $"call {phoneNumbersArray[i]}")
                    {
                        Console.WriteLine($"calling {namesArray[i]}...");

                        Console.WriteLine(GetPhoneDigitsSum(phoneNumbersArray[i]) % 2 != 0
                            ? "no answer"
                            : $"call ended. duration: {GetDuration(GetPhoneDigitsSum(phoneNumbersArray[i]))}");
                    }
                    else if (inputNames == $"call {namesArray[i]}")
                    {
                        Console.WriteLine($"calling {phoneNumbersArray[i]}...");

                        Console.WriteLine(GetPhoneDigitsSum(phoneNumbersArray[i]) % 2 != 0
                            ? "no answer"
                            : $"call ended. duration: {GetDuration(GetPhoneDigitsSum(phoneNumbersArray[i]))}");
                    }
                    else if (inputNames == $"message {phoneNumbersArray[i]}")
                    {
                        Console.WriteLine($"sending sms to {namesArray[i]}...");

                        Console.WriteLine(GetPhoneDigitsSum(phoneNumbersArray[i]) % 2 != 0
                            ? "busy"
                            : "meet me there"); 
                    }
                    else if (inputNames == $"message {namesArray[i]}")
                    {
                        Console.WriteLine($"sending sms to {phoneNumbersArray[i]}...");

                        Console.WriteLine(GetPhoneDigitsSum(phoneNumbersArray[i]) % 2 != 0
                            ? "busy"
                            : "meet me there");
                    }
                }

                inputNames = Console.ReadLine();
            }
        }

        static bool IsDigit(char symbol)
        {
            return (symbol >= '0' && symbol <= '9');

        }

        static int GetPhoneDigitsSum(string number)
        {
            int sum = 0;

            foreach (char symbol in number)
            {
                if (IsDigit(symbol))
                {
                    sum += symbol - '0';
                }
            }
            return sum;
        }

        static string GetDuration(int sum)
        {
            string duration = String.Empty;
            int hours = sum / 60;
            int minutes = sum % 60;
            duration = $"{hours:d2}:{minutes:d2}";

            return duration;
        }
    }
}
