using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Every_Digit_Sort
{
    class Program
    {
        static void Main()
        {
            Console.WriteLine("29. 各位數字和排序");
            Console.WriteLine("請輸入個數.");

            int inputN = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("請輸入數字.");
            string[] inputNum = Console.ReadLine().Split(' ');
                        
            int[,] total = new int[inputN, 2];

            // 將該數字加總
            for(int i = 0; i < inputN; i++)
            {
                for(int j = 0; j < inputNum[i].Length; j++)
                {
                    total[i, 1] += Convert.ToInt32(Convert.ToString(inputNum[i][j]));
                }
                total[i, 0] = Convert.ToInt32(inputNum[i]);
            }

            //排序數字總和
            for (int i = 0; i < inputN; i++)
            {
                for(int j = 0; j < inputN - 1; j++)
                {
                    if(total[j, 1] > total[j + 1, 1])
                    {
                        // [0] N為原值 [1]Total為該數字Sum
                        int tempN;
                        int tempTotal;

                        tempN = total[j, 0];
                        tempTotal = total[j, 1];

                        total[j, 0] = total[j + 1, 0];
                        total[j, 1] = total[j + 1, 1];

                        total[j + 1, 0] = tempN;
                        total[j + 1, 1] = tempTotal;

                    }
                }
            }

            //排序遇到總和相等時小往左 大往右
            for(int i = 0; i < inputN; i++)
            {
                for(int j = 0; j < inputN - 1; j++)
                {
                    if(total[j, 1] == total[j + 1, 1])
                    {
                        if(total[j, 0] > total[j + 1, 0])
                        {
                            int tempN;
                            int tempTotal;

                            tempN = total[j, 0];
                            tempTotal = total[j, 1];

                            total[j, 0] = total[j + 1, 0];
                            total[j, 1] = total[j + 1, 1];

                            total[j + 1, 0] = tempN;
                            total[j + 1, 1] = tempTotal;

                        }
                    }
                }
            }                   

            for (int i = 0; i < inputNum.Length; i++)
            {
                Console.Write(total[i, 0] + " ");
            }
            Console.ReadLine();

        }
    }
}
