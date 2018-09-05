using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Decryption
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("解密 ");
            Console.WriteLine("請輸入Y.");
            string inputValue = Console.ReadLine();

            string a = Convert.ToString(inputValue[0]);
            string b = Convert.ToString(inputValue[1]);
            string c = Convert.ToString(inputValue[2]);
            string d = Convert.ToString(inputValue[3]);

            int int_a = Convert.ToInt32(a);
            int int_b = Convert.ToInt32(b);
            int int_c = Convert.ToInt32(c);
            int int_d = Convert.ToInt32(d);

            string stra, strb, strc, strd ;
            string ans = "";

            for (int i =0; i < 10; i++)
            {
                int_a = int_a + 10;
                if (int_a % 3 == 0)
                {
                    stra = Convert.ToString(int_a / 3);
                    ans += stra;
                    break;
                }                         
            }

            for (int i = 0; i < 10; i++)
            {
                int_b = int_b + 10;
                if (int_b % 3 == 0)
                {
                    strb = Convert.ToString(int_b / 3);
                    ans += strb;
                    break;
                }
            }
            for (int i = 0; i < 10; i++)
            {
  
                if (int_c % 3 == 0)
                {
                    strc = Convert.ToString(int_c / 3);
                    ans += strc;
                    break;
                }
                int_c = int_c + 10;
            }
            for (int i = 0; i < 10; i++)
            {
                int_d = int_d + 10;
                if (int_d % 3 == 0)
                {
                    strd = Convert.ToString(int_d / 3);
                    ans += strd;
                    break;
                }
            }
            Console.WriteLine(ans);
            Console.ReadLine();
        }
    }
}
