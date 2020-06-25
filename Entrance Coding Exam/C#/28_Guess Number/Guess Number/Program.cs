using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Guess_Number
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("28. 猜數字");
            check();
        }

        static void check()
        {
            //假設答案
            string ans = "1234";
            Console.WriteLine("請輸入數字.");
            string input = Console.ReadLine();

            int a = 0;
            int b = 0;

            if (input.Equals("0000"))
            {
                Console.WriteLine("結束程式");
                Console.ReadLine();
            }
            else
            {
                for(int i = 0; i < 4; i++)
                {
                    if(input[i] == ans[i])
                    {
                        a++;
                    }
                    else
                    {
                        for(int j = 0; j < 4; j++)
                        {
                            if(input[i] == ans[j])
                            {
                                b++;
                            }
                        }
                    }
                }

                Console.WriteLine(a + "A" + b + "B");
                check();

            }
        }
    }
}
