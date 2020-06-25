using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Odd_Even_Calculation
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("23. 奇偶數差計算");
            Console.WriteLine("請輸入數字.");
            string inputValue = System.Console.ReadLine();

            int odd = 0;
            int even = 0;

            for(int i = 0; i < inputValue.Length; i++)
            {
                if(i % 2 == 0)
                {
                    Console.WriteLine("第" + i + "_" +  inputValue[i]);
                    even += Convert.ToInt32(Convert.ToString(inputValue[i]));
                }else if(i % 2 == 1)
                {
                    Console.WriteLine("第" + i + "_" + inputValue[i]);
                    odd += Convert.ToInt32(Convert.ToString(inputValue[i]));
                }
            }

            string check = (odd - even) % 11 == 0 ? "為" : "不是";

            Console.WriteLine(inputValue + "之奇偶數差 " + check + " 11 的倍數 ");
            
            System.Console.ReadLine();

        }
    }
}
