﻿using System;

namespace p14MagicLetter
{
    class MagicLetter
    {
        static void Main(string[] args)
        {
            char firstLetter = char.Parse(Console.ReadLine());
            char secondLetter = char.Parse(Console.ReadLine());
            char controlLetter = char.Parse(Console.ReadLine());

            for (char i = firstLetter; i <= secondLetter; i++)
            {
                for (char j = firstLetter; j <= secondLetter; j++)
                {
                    for (char k = firstLetter; k <= secondLetter; k++)
                    {
                        if (i != controlLetter && j != controlLetter && k != controlLetter)
                        {
                            Console.Write($"{i}{j}{k} " );
                        }
                    }
                }
            }
        }
    }
}
