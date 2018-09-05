using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Santa_Claus_and_Reindeer
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("聖誕老人與馴鹿 ");
            float x = 1;
            Console.WriteLine("請輸入頭的數量.");
            float head = (float)Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("請輸入腳的數量.");

            float foot = (float)Convert.ToDouble(Console.ReadLine());                     
            float x1 = (head - foot * (x / 4)) / (1 - 2 * (x / 4));
            float y1 = head - x1;
            Console.WriteLine("聖誕老人 {0}位 馴鹿{1}隻.", x1, y1);
            Console.ReadKey();
        }
    }
}
