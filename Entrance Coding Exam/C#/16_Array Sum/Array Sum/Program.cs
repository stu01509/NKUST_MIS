using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Collections;

namespace Array_Sum
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("數字加密");
            Console.WriteLine("請輸入陣列1.");
            string[] input1 = Console.ReadLine().Split(' ');
            string[] input2 = Console.ReadLine().Split(' ');
            string[] input3 = Console.ReadLine().Split(' ');
            Console.WriteLine("請輸入陣列2.");
            string[] input4 = Console.ReadLine().Split(' ');
            string[] input5 = Console.ReadLine().Split(' ');
            string[] input6 = Console.ReadLine().Split(' ');


            add(Convert.ToInt32(input1[0]), Convert.ToInt32(input4[0]));
            add(Convert.ToInt32(input1[1]), Convert.ToInt32(input4[1]));
            add(Convert.ToInt32(input1[2]), Convert.ToInt32(input4[2]));
            Console.WriteLine("");
            add(Convert.ToInt32(input2[0]), Convert.ToInt32(input5[0]));
            add(Convert.ToInt32(input2[1]), Convert.ToInt32(input5[1]));
            add(Convert.ToInt32(input2[2]), Convert.ToInt32(input5[2]));
            Console.WriteLine("");
            add(Convert.ToInt32(input3[0]), Convert.ToInt32(input6[0]));
            add(Convert.ToInt32(input3[1]), Convert.ToInt32(input6[1]));
            add(Convert.ToInt32(input3[2]), Convert.ToInt32(input6[2]));       

            Console.ReadLine();
        }
       

        static void add(int a, int b)
        {
            Console.Write(a + b + " ");
        }

    }
}
