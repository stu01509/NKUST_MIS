using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Pascal_Triangle
{
    class Program
    {
        static void Main(string[] args)
        {


            //點的數量
            Console.WriteLine("30. 帕斯卡三角形");
            Console.WriteLine("請輸入點的數量.");
            int inputN = Convert.ToInt32(Console.ReadLine());

            int[,] dotData = new int[inputN, 2];

            Console.WriteLine("請輸入點的位置.");
            for (int i = 0; i < inputN; i++)
            {
                string[] inputDot = Console.ReadLine().Split(',');
                dotData[i, 0] = Convert.ToInt32(inputDot[0]);
                dotData[i, 1] = Convert.ToInt32(inputDot[1]);
            }


            for(int i = 0; i < inputN; i++)
            {
                pascal(dotData[i, 0] , dotData[i, 1]);
            }

            Console.ReadLine();
        }

        public static void pascal(int num, int position)
        {

            // 先將數字計算儲存至 Array
            //  如題目的 0 ≤ n ≤ 65, Array空間最大設為 67
            int[,] table = new int[67, 67];

            table[0, 0] = 1;

            for (int y = 1; y < 67; y++)
            {
                // 每列的起始與最後位皆為1
                table[y, 0] = table[y - 1, 0];

                for (int i = 1; i < 67; i++)
                {
                    table[y, i] = table[y - 1, i] + table[y - 1, i - 1];
                }
            }

            int n = num;

            // 用來儲存最後一行的Array
            int[] ans = new int[num + 1];

            for (int y = 0; y <= num; y++)
            {
                for (int i = 0; i < y + 1; i++)
                {
                    ans[i] = table[y, i];
                }               
            }

            //換行
            Console.WriteLine("");

            Console.WriteLine(ans[position]);
        }
    }
}
