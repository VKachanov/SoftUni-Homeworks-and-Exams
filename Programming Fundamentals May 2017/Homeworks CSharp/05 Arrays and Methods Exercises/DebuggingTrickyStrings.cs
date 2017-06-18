﻿using System;

namespace p19_DebuggingTrickyStrings
{
    class DebuggingTrickyStrings
    {
        static void Main(string[] args)
        {
            var delimiter = Console.ReadLine();
            var numberOfStrings = int.Parse(Console.ReadLine());

            var result = string.Empty;
            var currentString = string.Empty;

            for (int i = 0; i < numberOfStrings - 1; i++)
            {
                currentString = Console.ReadLine();
                result += currentString + delimiter;
            }

            currentString = Console.ReadLine();
            result += currentString;
            Console.WriteLine(result);
        }
    }
}
