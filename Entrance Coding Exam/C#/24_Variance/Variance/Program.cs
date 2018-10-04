using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Variance
{
    class Program
    {
        static void Main(string[] args)
        {

            Console.WriteLine("變異數");
            Console.WriteLine("請輸入數字.");
            string[] inputValue = Console.ReadLine().Split(' ');

            Double total = 0;
            Double ave = 0;
            Double diff = 0;
            Double ans = 0;

            for (int i = 0; i < inputValue.Length; i++)
            {
                total += Convert.ToInt32(Convert.ToString(inputValue[i]));
            }

            ave = total / inputValue.Length;
           
            for(int i = 0; i < inputValue.Length; i++)
            {
                diff += (Convert.ToInt32(Convert.ToString(inputValue[i])) - ave) * 
                        (Convert.ToInt32(Convert.ToString(inputValue[i])) - ave);
            }

            ans = diff / inputValue.Length;

            Console.WriteLine(ans.ToString("f2"));
            Console.ReadLine();

        }
    }
}
