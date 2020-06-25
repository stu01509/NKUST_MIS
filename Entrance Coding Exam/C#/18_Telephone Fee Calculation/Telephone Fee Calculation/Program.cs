using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Telephone_Fee_Calculation
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("18. 電信費用的計算");
            Console.WriteLine("請輸入秒數.");

            int inputValue = Convert.ToInt32(System.Console.ReadLine());
            double price = 0;

            if(inputValue <= 180)
            {
                price = inputValue * 0.16;
            }else if (181 <= inputValue  && inputValue <= 300)
            {
                price = (inputValue * 0.16) * 0.9;
            }
            else if (301 <= inputValue && inputValue <= 600)
            {
                price = (inputValue * 0.16) * 0.8;
            }
            else if (inputValue >= 600)
            {
                price = (inputValue * 0.16) * 0.7;
            }

            System.Console.WriteLine(price);
            System.Console.ReadLine();

        }
    }
}
