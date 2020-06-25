using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Encryption
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("15. 數字加密");
            Console.WriteLine("請輸入4位數字.");
            string input = Console.ReadLine();

            int one = Convert.ToInt32(input[0].ToString());
            int two = Convert.ToInt32(input[1].ToString());
            int three = Convert.ToInt32(input[2].ToString());
            int four = Convert.ToInt32(input[3].ToString());
            
            int changedOne = (three + 7) % 10;
            int changedTwo = (four + 7) % 10;
            int changedThree = (one + 7) % 10;
            int changedFour = (two + 7) % 10;

            string ans = changedOne.ToString() + changedTwo.ToString() + changedThree.ToString() + changedFour.ToString();
  
            Console.WriteLine(ans);
            Console.ReadLine();
        }
    }
}
