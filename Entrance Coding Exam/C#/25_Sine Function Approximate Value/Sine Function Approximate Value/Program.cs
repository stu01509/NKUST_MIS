using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sine_Function_Approximate_Value
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("25. 求 sin 函數的近似值");
            Console.WriteLine("請輸入 x 及一個正整數 N");
                       
            string[] inputValue = Console.ReadLine().Split(' ');
            int x = int.Parse(inputValue[0]);
            int n = int.Parse(inputValue[1]);
            double sin = 0;

            for (int i = 0; i <= n; i++)
            {
                int g = 2 * i + 1;
                for (int j = 2 * i + 1; j > 0; j--)
                {
                    g = g * (2 * i + 1);
                }
                sin = sin + (Math.Pow(-1, i) / g * Math.Pow(x, 2 * n + 1));

            }
            sin = Math.Round(sin, 2);
            Console.Write(sin);

            Console.ReadLine();

        }
    }
}
