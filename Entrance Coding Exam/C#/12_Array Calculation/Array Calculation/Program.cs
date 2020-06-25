using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Array_Calculation
{
    class Program
    {
        static void Main(string[] args)
        {

            Console.WriteLine("12. 陣列計算");
            Console.WriteLine("請輸入第一筆數字.");
            string[] Arr1 = Console.ReadLine().Split(' ');
            Console.WriteLine("請輸入第二筆數字.");
            string[] Arr2 = Console.ReadLine().Split(' ');
            string ans = "";
            
            for(int i=0; i< Arr1.Length; i++)
            {
                if((Convert.ToChar(Arr1[i]) + Convert.ToChar(Arr2[i])) % 2 == 0)
                {
                ans += "0";
                }
                else
                {
                ans += "1";
                }
            }
            Console.WriteLine(ans);
            Console.ReadLine();
        }
    }
}
