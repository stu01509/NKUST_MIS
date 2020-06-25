using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Greatest_Common_Divisor
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("21. 最大公因數");
            Console.WriteLine("請輸入第 1 個數字.");
            int num1 = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("請輸入第 2 個數字.");
            int num2 = Convert.ToInt32(Console.ReadLine());

            int ans = 0;
            
            for (int i = 1; i <= num1 && i <= num2; i++)
                if (num1 % i == 0 && num2 % i == 0)
                {
                    ans = i;
                }

            Console.WriteLine(ans);
            Console.ReadLine();
        }
    }
}
