using System;

namespace p09CountTheIntegers
{
    class CountTheIntegers
    {
        static void Main(string[] args)
        {
            int count = 0;
            try
            {
                
                while (true)
                {
                    int input = int.Parse(Console.ReadLine());
                    count++;
                }
                
            }
            catch (Exception)
            {
                Console.WriteLine(count);
                
            }
        }
    }
}
