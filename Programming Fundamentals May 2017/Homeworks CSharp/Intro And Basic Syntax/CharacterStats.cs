using System;

namespace P05CharacterStats
{
    class Program
    {
        static void Main(string[] args)
        {
            string characterName = Console.ReadLine();
            int currentHealth = int.Parse(Console.ReadLine());
            int maximumHealth = int.Parse(Console.ReadLine());
            int currentEnergy = int.Parse(Console.ReadLine());
            int maximumEnergy = int.Parse(Console.ReadLine());

            int healthDotsCount = maximumHealth - currentHealth;
            string health = new string('|', currentHealth + 1) + new string('.', healthDotsCount) + "|";

            int energyDotsCount = maximumEnergy - currentEnergy;
            string energy = new string('|', currentEnergy + 1) + new string('.', energyDotsCount) + "|";

            Console.WriteLine($"Name: {characterName}");
            Console.WriteLine($"Health: {health}");
            Console.WriteLine($"Energy: {energy}");
        }
    }
}
