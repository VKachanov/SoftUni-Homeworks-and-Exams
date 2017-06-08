using System;

namespace p16TrickyStrings
{
    class TrickyStrings
    {
        static void Main(string[] args)
        {
            string delimiter = Console.ReadLine();
            int n = int.Parse(Console.ReadLine());

            string text = String.Empty;

            for (int i = 0; i < n; i++)
            {
                string inputStr = Console.ReadLine();
                text += inputStr + delimiter;
            }

            text = text.Remove(text.Length - delimiter.Length, delimiter.Length);
            Console.WriteLine(text);
        }
    }
}
