using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Electricity_Pricing_Calc
{
    class Program
    {
        static void Main(string[] args)
        {
            String inputWatt ;
            int int_inputWatt;
            double[] summer = {2.10, 3.02, 4.39, 4.97, 5.63 };
            double[] nosummer = { 2.10, 3.02, 4.39, 4.97, 5.63 };


            Console.WriteLine("電費計算");
            Console.WriteLine("請輸入度數.");

            inputWatt = Console.ReadLine();
            int_inputWatt = Convert.ToInt32(inputWatt);

            if (int_inputWatt < 120)
            {
                Console.WriteLine("Summer months:" + Math.Round(int_inputWatt * summer[0], 2));
                Console.WriteLine("Summer months:" + Math.Round(int_inputWatt * nosummer[0], 2));
            }
            else if( int_inputWatt<=330)
            {
                Console.WriteLine("Summer months:" + Math.Round(int_inputWatt * summer[1], 2));
                Console.WriteLine("Summer months:" + Math.Round(int_inputWatt * nosummer[1], 2));
            }
            else if (int_inputWatt <= 500)
            {
                Console.WriteLine("Summer months:" + Math.Round(int_inputWatt * summer[2], 2));
                Console.WriteLine("Summer months:" + Math.Round(int_inputWatt * nosummer[2], 2));
            }
            else if (int_inputWatt <= 700)
            {
                Console.WriteLine("Summer months:" + Math.Round(int_inputWatt * summer[3], 2));
                Console.WriteLine("Summer months:" + Math.Round(int_inputWatt * nosummer[3], 2));
            }
            else
            {
                Console.WriteLine("Summer months:" + Math.Round(int_inputWatt * summer[4], 2));
                Console.WriteLine("Summer months:" + Math.Round(int_inputWatt * nosummer[4], 2));
            }
            Console.ReadLine();
        }
    }
}
