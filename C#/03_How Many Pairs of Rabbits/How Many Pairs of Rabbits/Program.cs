using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace How_Many_Pairs_of_Rabbits
{
    class Program
    {
        static void Main(string[] args)
        {
            String month;
            int int_month , ans, first, second;


            Console.WriteLine("到底有幾對兔子?\r\n");
            Console.WriteLine("請輸入月份.");

            month = Console.ReadLine();
            int_month = Convert.ToInt32(month);

            ans = 0;
            first = 1;

            if (int_month == 1 || int_month == 2)
            {
                Console.WriteLine(1);
            }
            else
            {
                for (var i = 0; i < int_month; i++)
                {
                    second = ans + first;
                    ans = first;
                    first = second;
                }
                Console.WriteLine(ans);
            }
            Console.ReadLine();
        }   
    }
}
