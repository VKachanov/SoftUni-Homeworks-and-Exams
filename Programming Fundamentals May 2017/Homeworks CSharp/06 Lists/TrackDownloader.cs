using System;
using System.Collections.Generic;
using System.Linq;

namespace p02_TrackDownloader
{
    class TrackDownloader
    {
        static void Main(string[] args)
        {
            List<string> blackList = Console.ReadLine().Split(' ').ToList();

            string fileNames = Console.ReadLine();

            List<string> outputList = new List<string>();

            while (fileNames != "end")
            {
                bool isContained = false;

                foreach (string bannedWord in blackList)
                {
                  
                    if (fileNames.Contains(bannedWord))
                    {
                        isContained = true;
                    }
                }

                if (!isContained)
                {
                    outputList.Add(fileNames);
                }
                
                fileNames = Console.ReadLine();
            }

            outputList.Sort();
            Console.WriteLine(String.Join("\r\n", outputList));
        }
    }
}
