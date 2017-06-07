using System;

namespace p07CakeIngredients
{
    class CakeIngredients
    {
        static void Main(string[] args)
        {
            string ingredient = Console.ReadLine();
            int counter = 0;

            while (ingredient != "Bake!")
            {
                Console.WriteLine($"Adding ingredient {ingredient}.");
                ingredient = Console.ReadLine();
                counter++;

            }
            Console.WriteLine($"Preparing cake with {counter} ingredients.");
        }
    }
}
