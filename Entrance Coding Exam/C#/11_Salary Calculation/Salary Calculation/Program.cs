using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Salary_Calculation
{
    class Program
    {
        static void Main(string[] args)
        {
            int person;
         
            Console.WriteLine("11. 薪資計算機");
            Console.WriteLine("請輸入員工人數.");
            person = Convert.ToInt32(Console.ReadLine());

            for(int i = 1; i <= person; i++)
            {
                Console.WriteLine("請輸入時數 時薪 工作日.");
                string[] strInputs = Console.ReadLine().Split(' ');
                int startH = Convert.ToInt32(strInputs[0]);
                int startM = Convert.ToInt32(strInputs[1]);
                int endH = Convert.ToInt32(strInputs[2]);
                int endM = Convert.ToInt32(strInputs[3]);
                int money = Convert.ToInt32(strInputs[4]);
                int workDay = Convert.ToInt32(strInputs[5]);

                if(endM - startM > 0)
                {
                    endH++;
                }

                Console.WriteLine(((endH - startH ) * money) * workDay);
            }
            Console.ReadLine();
        }
    }
}
