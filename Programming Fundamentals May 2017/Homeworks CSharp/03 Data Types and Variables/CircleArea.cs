﻿using System;

namespace p02CircleArea
{
    class CircleArea
    {
        static void Main(string[] args)
        {
            double radius = double.Parse(Console.ReadLine());
            Console.WriteLine("{0:f12}", Math.PI * radius * radius);

        }
    }
}
