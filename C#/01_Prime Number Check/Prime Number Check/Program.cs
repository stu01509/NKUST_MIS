using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Prime_Number_Check
{
    class Program
    {
        static void Main(string[] args)
        {
            int a, i, k;
            k = 0;
            Console.WriteLine("Prime Number Check 質數判斷\r\n");
            Console.WriteLine("請輸入一個數字.");
            a = Int32.Parse(Console.ReadLine());

            for (i = 1; i <= a; i++)
            {
                if (a % i == 0)
                {
                    k++;
                }
            }

            if (k == 2)
            {
                Console.WriteLine("Yes.");
            }
            else
            {
                Console.WriteLine("No.");
            }
            Console.ReadLine();
        }
    }
}
