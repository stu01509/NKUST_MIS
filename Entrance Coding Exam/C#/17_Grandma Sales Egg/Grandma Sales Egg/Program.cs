using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Grandma_Sales_Egg
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("阿婆賣蛋");
            Console.WriteLine("請輸入數字.");
            int inputValue = Convert.ToInt32(System.Console.ReadLine());

            for(int i = 0; i < inputValue; i++)
            {
                if(i % 7 == 2 && i % 9 == 2 && i % 3 == 2 )
                {
                    System.Console.WriteLine(i);
                }
            }

            System.Console.ReadLine();
        }
    }
}
