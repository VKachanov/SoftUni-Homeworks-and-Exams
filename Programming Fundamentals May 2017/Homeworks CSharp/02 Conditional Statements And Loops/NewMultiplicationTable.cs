using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p10MultiplicationTable2._0
{
    class NewMultiplicationTable
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int times = int.Parse(Console.ReadLine());
            do
            {
                Console.WriteLine($"{n} X {times} = {n * times}");
                times++;
            } while (times <= 10);

        }
    }
}
