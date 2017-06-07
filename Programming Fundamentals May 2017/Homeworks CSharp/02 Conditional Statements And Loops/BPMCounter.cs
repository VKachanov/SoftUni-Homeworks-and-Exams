using System;

namespace p05BPMCounter
{
    class BPMCounter
    {
        static void Main(string[] args)
        {
            int bpm = int.Parse(Console.ReadLine());
            int beats = int.Parse(Console.ReadLine());

            double bars = Math.Round(beats / 4.0, 1);

            double perc = beats * 100.0 / bpm;
            double lengthSeconds = 60 * perc / 100.0;

            int minutes = (int)lengthSeconds / 60;
            int seconds = (int)lengthSeconds % 60;

            Console.WriteLine($"{bars} bars - {minutes:f0}m {seconds:f0}s");
        }
    }
}
