using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Artist_Audition
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("5. 藝人選秀");
            Console.WriteLine("請輸入人數.");
            int inputPerson = Convert.ToInt32(Console.ReadLine());
            int[,] reslut = new int[inputPerson, 2];

            Console.WriteLine("請輸入評分.");
                        for (int i = 0; i < inputPerson; i++)
            {
                string[] strInputs = Console.ReadLine().Split(' ');

                int order = Convert.ToInt32(strInputs[0]);
                int face = Convert.ToInt32(strInputs[1]);
                int singing = Convert.ToInt32(strInputs[2]);
                int talk = Convert.ToInt32(strInputs[3]);
                int acting = Convert.ToInt32(strInputs[4]);

                double ans = (face * 0.3) + (singing * 0.3) + (talk * 0.2) + (acting * 0.2);
                reslut[i,0] = Convert.ToInt32(Math.Ceiling(ans));
                reslut[i, 1] = order;

            }

            for (int i = 0; i <= inputPerson; i++)
            {
                for (int j = 0; j < inputPerson - 1; j++)
                {
                    if (reslut[j, 0] < reslut[j + 1, 0])
                    {
                        int temp = reslut[j + 1, 0];
                        int tempOrd = reslut[j + 1, 1];

                        reslut[j + 1, 0] = reslut[j, 0];
                        reslut[j + 1, 1] = reslut[j, 1];


                        reslut[j, 0] = temp;
                        reslut[j, 1] = tempOrd;
                    }
                }
            }
            for (int i = 0; i < 3; i++)
            {
                Console.Write(reslut[i, 1] + ">");
            }

            Console.ReadLine();

        }
    }
}
