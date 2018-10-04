using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Farthest_Two_Points
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("最遠的兩點");
            Console.WriteLine("請輸入幾個點.");
            int[,] dataDot = new int[1000, 2];
            int inputValue = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("請輸入座標.");
            for (int i = 1; i <= inputValue; i++)
            {
                string[] inputDot = Console.ReadLine().Split(' ');
                dataDot[i, 0] = int.Parse(inputDot[0]);
                dataDot[i, 1] = int.Parse(inputDot[1]);

            }
            int distanceMax = 0;
            for (int i = 1; i < inputValue; i++)
            {
                for (int j = i + 1; j <= inputValue; j++)
                {
                    int distance = (int)(Math.Pow(dataDot[i, 0] - dataDot[j, 0], 2) + Math.Pow(dataDot[i, 1] - dataDot[j, 1], 2));
                    if (distance > distanceMax)
                    {
                        distanceMax = distance;
                    }
                }
            }
            Console.Write(distanceMax);
                       
            Console.ReadLine();

        }
    }
}
