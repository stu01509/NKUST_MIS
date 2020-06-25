using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Centroid_Incircle__Incenter
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("26. 三座標點求其重心、內心、外心");
            Console.WriteLine("請輸入座標位置.");

            string[] inputOne = Console.ReadLine().Split(' ');
            string[] inputTwo = Console.ReadLine().Split(' ');
            string[] inputThree = Console.ReadLine().Split(' ');

            double x1 = Convert.ToInt32(inputOne[0]);
            double y1 = Convert.ToInt32(inputOne[1]);
            double x2 = Convert.ToInt32(inputTwo[0]);
            double y2 = Convert.ToInt32(inputTwo[1]);
            double x3 = Convert.ToInt32(inputThree[0]);
            double y3 = Convert.ToInt32(inputThree[1]);

            //重心
            double centroidX = 0;
            double centroidY = 0;

            centroidX = (x1 + x2 + x3) / 3;
            centroidY = (y1 + y2 + y3) / 3;
            Console.WriteLine(centroidX);
            Console.WriteLine(centroidY);

            //內心
            double incircleA = 0;
            double incircleB = 0;
            double incircleC = 0;
            double incircleSum = 0;
                        
            double incircleX = 0;
            double incircleY = 0;


            incircleA = Math.Sqrt(Math.Pow(Math.Abs((x2 - x3)), 2) + Math.Pow(Math.Abs((y2 - y3)), 2));
            incircleB = Math.Sqrt(Math.Pow(Math.Abs((x1 - x3)), 2) + Math.Pow(Math.Abs((y1 - y3)), 2));
            incircleC = Math.Sqrt(Math.Pow(Math.Abs((x2 - x1)), 2) + Math.Pow(Math.Abs((y2 - y1)), 2));
            incircleSum = incircleA + incircleB + incircleC;

            
            incircleX = ((incircleA * x1) + (incircleB * x2) + (incircleC * x3)) / incircleSum;
            incircleY = ((incircleA * y1) + (incircleB * y2) + (incircleC * y3)) / incircleSum;

            Console.WriteLine(incircleX);
            Console.WriteLine(incircleY);

            //外心
            double cosA = (Math.Pow(incircleB, 2) + Math.Pow(incircleC, 2) - Math.Pow(incircleA, 2)) / (2 * incircleB * incircleC);
            double cosB = (Math.Pow(incircleC, 2) + Math.Pow(incircleA, 2) - Math.Pow(incircleB, 2)) /( 2 * incircleA * incircleC);
            double cosC = (Math.Pow(incircleB, 2) + Math.Pow(incircleA, 2) - Math.Pow(incircleC, 2)) /( 2 * incircleA * incircleB);
            double centerX = (x1 * incircleA * cosA + x2 * incircleB * cosB + x3 * incircleC * cosC) / ( incircleA * cosA +  incircleB * cosB +  incircleC * cosC);
            double centerY = (y1 * incircleA * cosA + y2 * incircleB * cosB + y3 * incircleC * cosC) / (incircleA * cosA + incircleB * cosB + incircleC * cosC);

            Console.WriteLine(centerX);
            Console.WriteLine(centerY);




            Console.ReadLine();

        }
    }
}
