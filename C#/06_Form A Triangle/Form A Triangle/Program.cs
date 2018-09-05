using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Form_A_Triangle
{
    class Program
    {
        static void Main(string[] args)
        {
            
            Console.WriteLine("能否構成三角形\r\n");
            Console.WriteLine("請輸入三邊長.");

            String inputuValue = Console.ReadLine();
            String[] clearlyValue = inputuValue.Split(' ');
            int[] side = new int[clearlyValue.Length];

            for (int i= 0; i< clearlyValue.Length;i++)
            {
                side[i] = Convert.ToInt32(clearlyValue[i].ToString());
            }


            if (side[0] + side[1] > side[2] && side[1] + side[2] > side[0] && side[2] + side[0] > side[1])
            {
                Console.WriteLine("fit");
            }
            else
            {
                Console.WriteLine("unfit");
            }

            Console.ReadLine();
        }
    }
}
