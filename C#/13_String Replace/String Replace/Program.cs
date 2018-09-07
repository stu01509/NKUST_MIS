using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace String_Replace
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("字串變換");
            Console.WriteLine("請輸入字串");
            string input = Console.ReadLine();
            string ans = "";

            foreach (char c in input)
            {
                // 將數字轉換成 0
                if(48 <= Convert.ToInt32(c) && Convert.ToInt32(c) <= 57)
                {
                    ans += "0";
                }

                // 將小寫 ASCII Dec轉成 大寫 ASCII Dec
                if (97 <= Convert.ToInt32(c) && Convert.ToInt32(c) <= 122)
                {
                    int numASCII = (int)c;
                    int upperNumASCII= numASCII - 32;
                    string upper = Convert.ToChar(upperNumASCII).ToString();
                    ans += upper;
                }
                // 將大寫字串拼接上ans 
                if (65 <= Convert.ToInt32(c) && Convert.ToInt32(c) <= 90)
                {
                    string upper = Convert.ToChar(c).ToString();
                    ans += upper;
                }
            }
            Console.WriteLine(ans);
            Console.ReadLine();
        }
    }
}
