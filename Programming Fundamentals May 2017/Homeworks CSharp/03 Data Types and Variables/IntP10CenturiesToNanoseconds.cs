﻿using System;

namespace int_p10_CenturiesToNanoseconds
{
    class IntP10CenturiesToNanoseconds
    {
        static void Main(string[] args)
        {
            int centuries = int.Parse(Console.ReadLine());

            int years = centuries * 100;
            decimal days = Math.Floor(years * 365.2422m);
            decimal hours = days * 24;
            decimal minutes = hours * 60;
            decimal seconds = minutes * 60;
            decimal miliseconds = seconds * 1000;
            decimal microseconds = miliseconds * 1000;
            decimal nanoseconds = microseconds * 1000;

            Console.WriteLine("{0} centuries = {1} years = {2} days = {3} hours = {4} minutes = {5} seconds = {6} milliseconds = {7} microseconds = {8} nanoseconds", centuries, years, days, hours, minutes, seconds, miliseconds, microseconds, nanoseconds);

        }
    }
}
