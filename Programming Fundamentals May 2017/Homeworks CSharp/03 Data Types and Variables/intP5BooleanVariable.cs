using System;

namespace int_p05_BooleanVariable
{
    class IntP5BooleanVariable
    {
        static void Main(string[] args)
        {
            string inputString = Console.ReadLine();

            bool stringValue = Convert.ToBoolean(inputString);

            Console.WriteLine(stringValue ? "Yes" : "No");
        }
    }
}
