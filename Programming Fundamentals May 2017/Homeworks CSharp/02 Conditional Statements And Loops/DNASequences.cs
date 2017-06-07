using System;

namespace p06DNASequences
{
    class DNASequences
    {
        static void Main(string[] args)
        {
            int matchSUm = int.Parse(Console.ReadLine());

            int counter = 0;
            int letterValue = 0;
            

            for (char i = 'A'; i <= 'T'; i++)
            {
                for (char j = 'A'; j <= 'T'; j++)
                {
                    for (char k = 'A'; k <= 'T'; k++)
                    {
                        bool validSequence = (i == 'A' || i == 'C' || i == 'G' || i == 'T') && (j == 'A' || j == 'C' || j == 'G' || j == 'T') && (k == 'A' || k == 'C' || k == 'G' || k == 'T');

                        if (validSequence)
                        {
                            int sum = 0;
                            switch (i)
                            {
                                case 'A':
                                    letterValue = 1;
                                    break;
                                case 'C':
                                    letterValue = 2;
                                    break;
                                case 'G':
                                    letterValue = 3;
                                    break;
                                case 'T':
                                    letterValue = 4;
                                    break;
                            }
                            sum += letterValue;
                            switch (j)
                            {
                                case 'A':
                                    letterValue = 1;
                                    break;
                                case 'C':
                                    letterValue = 2;
                                    break;
                                case 'G':
                                    letterValue = 3;
                                    break;
                                case 'T':
                                    letterValue = 4;
                                    break;
                            }
                            sum += letterValue;
                            switch (k)
                            {
                                case 'A':
                                    letterValue = 1;
                                    break;
                                case 'C':
                                    letterValue = 2;
                                    break;
                                case 'G':
                                    letterValue = 3;
                                    break;
                                case 'T':
                                    letterValue = 4;
                                    break;
                            }
                            sum += letterValue;
                            if (sum >= matchSUm)
                            {
                                Console.Write($"O{i}{j}{k}O ");
                            }
                            else
                            {
                                Console.Write($"X{i}{j}{k}X ");
                            }
                            
                            counter++;
                        }
                        if (validSequence && counter % 4 == 0)
                        {
                            Console.WriteLine();
                        }
                    }
                }
            }
        }
    }
}
