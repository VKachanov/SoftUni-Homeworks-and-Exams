using System;
using System.Collections.Generic;
using System.Linq;

namespace p04_SplitByWordCasing
{
    class SplitByWordCasing
    {
        static void Main(string[] args)
        {
            List<string> input = Console.ReadLine().Split(new char[] {' ', ',', ';', ':', '.', '!', '(', ')', '"', '\'', '\\', '/', '[', ']' }, StringSplitOptions.RemoveEmptyEntries).ToList();

            List<string> lowercase = new List<string>();
            List<string> uppercase = new List<string>();
            List<string> mixedCase = new List<string>();

            
            
            foreach (string word in input)
            {
                int lowerCount = 0;
                int upperCount = 0;

                foreach (char letter in word)
                {

                    if (char.IsLower(letter))
                    {
                        lowerCount++;
                    }else if (char.IsUpper(letter))
                    {
                        upperCount++;
                    }
                }

                if (lowerCount == word.Length)
                {
                    lowercase.Add(word);
                }
                else if (upperCount == word.Length)
                {
                    uppercase.Add(word);
                }
                else
                {
                    mixedCase.Add(word);
                }
            }

            Console.WriteLine("Lower-case: {0}", String.Join(", ", lowercase));
            Console.WriteLine("Mixed-case: {0}", String.Join(", ", mixedCase));
            Console.WriteLine("Upper-case: {0}", String.Join(", ", uppercase));
        }
    }
}
