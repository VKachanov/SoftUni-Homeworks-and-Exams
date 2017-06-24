using System;
using System.Collections.Generic;
using System.Linq;

namespace p02_AppendLists
{
    class AppendLists
    {
        static void Main(string[] args)
        {
            List<string> output = new List<string>();

            List<string> input = Console.ReadLine().Split('|').ToList();

            for (int i = input.Count - 1; i >= 0; i--)
            {
               
                output.Add(String.Join(" ", input[i].Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries)));
            }

            Console.WriteLine(string.Join(" ", output));
        }
    }
}
