using System;

namespace p15NeighbourWars
{
    class NeighbourWars
    {
        static void Main(string[] args)
        {
            int peshoDamage = int.Parse(Console.ReadLine());
            int goshoDamage = int.Parse(Console.ReadLine());

            int peshoHealth = 100;
            int goshoHealth = 100;
            string winner = "";
            string attacker = "";
            string attackName = "";
            string defender = "";

            for (int i = 1; i < 101; i++)
            {

                if (i % 2 != 0)
                {
                    attacker = "Pesho";
                    attackName = "Roundhouse kick";
                    defender = "Gosho";
                    goshoHealth -= peshoDamage;

                    if (goshoHealth <= 0)
                    {
                        winner = "Pesho";
                        Console.WriteLine($"{winner} won in {i}th round.");
                        return;
                    }
                    else
                    {
                        Console.WriteLine($"{attacker} used {attackName} and reduced {defender} to {goshoHealth} health.");
                    }
                }
                else
                {
                    attacker = "Gosho";
                    attackName = "Thunderous fist";
                    defender = "Pesho";
                    peshoHealth -= goshoDamage;

                    if (peshoHealth <= 0)
                    {
                        winner = "Gosho";
                        Console.WriteLine($"{winner} won in {i}th round.");
                        return;
                    }
                    else
                    {
                        Console.WriteLine($"{attacker} used {attackName} and reduced {defender} to {peshoHealth} health.");
                    }
                }

                if (i % 3 == 0)
                {
                    goshoHealth += 10;
                    peshoHealth += 10;
                }

            }
        }
    }
}
