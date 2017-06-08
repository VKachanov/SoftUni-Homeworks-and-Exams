using System;

namespace p06IncrementVariable
{
    class IncrementVariable
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            int overflow = 0;
            byte temp = 0;
            for (int i = 0; i < n; i++)
            {
                temp++;

                if (temp == 0)
                {
                    overflow++;
                }
            }
            Console.WriteLine(temp);
            if (overflow > 0)
            {
                Console.WriteLine($"Overflowed {overflow} times");
            }

        }
    }
}
