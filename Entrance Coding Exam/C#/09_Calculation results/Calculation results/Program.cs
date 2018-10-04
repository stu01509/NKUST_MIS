using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Calculation_results
{
    class Program
    {
        static void Main(string[] args)
        {
            int m, n, m_Result=1, n_Result=1, sub_Result=1,ans;

            Console.WriteLine("計算結果");
            Console.WriteLine("請輸入m.");
            m = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("請輸入n.");
            n = Convert.ToInt32(Console.ReadLine());

            for(int i = 1; i <= m; i++)
            {
                m_Result = m_Result * i;
            }
            for (int j = 1; j <= n; j++)
            {
                n_Result = n_Result * j;
            }
            for (int k = 1; k <= m-n; k++)
            {
                sub_Result = sub_Result * k;
            }

            ans = m_Result / (n_Result * sub_Result);
            Console.WriteLine("答案為："+ Math.Abs(ans));
            Console.ReadLine();
        }
    }
}
