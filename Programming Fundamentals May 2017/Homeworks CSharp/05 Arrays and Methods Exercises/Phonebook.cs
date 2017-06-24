using System;

namespace p03_Phonebook
{
    class Phonebook
    {
        static void Main(string[] args)
        {
            string[] phoneNumbersArray = Console.ReadLine().Split(' ');
            string[] namesArray = Console.ReadLine().Split(' ');

            string inputNames = Console.ReadLine(); 

            while (inputNames != "done")
            {
                
                for (int i = 0; i < phoneNumbersArray.Length; i++)
                {
                    if (inputNames == namesArray[i])
                    {
                        Console.WriteLine($"{namesArray[i]} -> {phoneNumbersArray[i]}");
                    }
                }

                inputNames = Console.ReadLine();
            }
        }
    }
}
