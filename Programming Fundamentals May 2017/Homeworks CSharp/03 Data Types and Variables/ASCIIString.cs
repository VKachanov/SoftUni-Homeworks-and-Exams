using System;

namespace p14ASCIIString
{
    class ASCIIString
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            string text = String.Empty;

            for (int i = 0; i < n; i++)
            {
                int asciiNumber = int.Parse(Console.ReadLine());

                text += (char)asciiNumber; 
            }
            Console.WriteLine(text);
        }
    }
}
