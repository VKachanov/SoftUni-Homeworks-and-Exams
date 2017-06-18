using System;

namespace p07_NumbersToWords
{
    class NumbersToWords
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            

            for (int i = 0; i < n; i++)
            {
                int number = int.Parse(Console.ReadLine());
                if (number / 100 == 0)
                {
                    continue;
                }
                Console.WriteLine(Letterize(number));
                
            }

        }

        static string Letterize(int number)
        {
            string[] zeroToNine =
            {
                "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" 
            };

            string[] teens =
                { "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

            string[] tens = { "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };

            string output = String.Empty;

            if (number > 999)
            {
                output = "too large";
            }
            else if (number < -999)
            {
                output = "too small";
            }
            else if (number > 0)
            {
                int lastDigit = 0;
                int secondDigit = 0;
                int firstDigit = 0;


                while (number != 0)
                {
                    lastDigit = number % 10;
                    number /= 10;
                    secondDigit = number % 10;
                    number /= 10;
                    firstDigit = number;
                    number /= 10;

                }

                if (lastDigit == 0 && secondDigit == 0)
                {
                    output = $"{zeroToNine[firstDigit]}-hundred";

                }
                else if (lastDigit != 0 && secondDigit == 0)
                {
                    output = $"{zeroToNine[firstDigit]}-hundred and {zeroToNine[lastDigit]}";

                }
                else if (secondDigit == 1 && (lastDigit > 0 && lastDigit <= 9))
                {
                    output = $"{zeroToNine[firstDigit]}-hundred and {teens[lastDigit - 1]}";

                }
                else if (lastDigit == 0 && secondDigit != 0)
                {
                    output = $"{zeroToNine[firstDigit]}-hundred and {tens[secondDigit - 1]}";
                }
                else
                {
                    output = $"{zeroToNine[firstDigit]}-hundred and {tens[secondDigit - 1]} {zeroToNine[lastDigit]}";
                }
            }
            else
            {
                int lastDigit = 0;
                int secondDigit = 0;
                int firstDigit = 0;

                number = Math.Abs(number);

                while (number != 0)
                {
                    lastDigit = number % 10;
                    number /= 10;
                    secondDigit = number % 10;
                    number /= 10;
                    firstDigit = number;
                    number /= 10;

                }

                if (lastDigit == 0 && secondDigit == 0)
                {
                    output = $"minus {zeroToNine[firstDigit]}-hundred";

                }
                else if (lastDigit != 0 && secondDigit == 0)
                {
                    output = $"minus {zeroToNine[firstDigit]}-hundred and {zeroToNine[lastDigit]}";

                }
                else if (secondDigit == 1 && (lastDigit > 0 && lastDigit <= 9))
                {
                    output = $"minus {zeroToNine[firstDigit]}-hundred and {teens[lastDigit - 1]}";

                }
                else if (lastDigit == 0 && secondDigit != 0)
                {
                    output = $" minus {zeroToNine[firstDigit]}-hundred and {tens[secondDigit - 1]}";
                }
                else
                {
                    output = $"minus {zeroToNine[firstDigit]}-hundred and {tens[secondDigit - 1]} {zeroToNine[lastDigit]}";
                }
            }
            
            return output;
        }
    }
}
