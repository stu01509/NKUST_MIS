using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Check_Coordinate_Inside_the_Circle_Range
{
    class Program
    {
        static void Main(string[] args)
        {
            int x, y;
            Console.WriteLine("10. 判斷座標是否在圓形的範圍內");
            Console.WriteLine("輸入X座標.");
            x = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("輸入Y座標.");
            y = Convert.ToInt32(Console.ReadLine());

            if((x*x)+(y*y) > 10000)
            {
                Console.WriteLine("Outside.");
            }else if ((x*x)+(y*y)<=10000)
            {
                Console.WriteLine("Inside.");
            }
            Console.ReadLine();
        }
    }
}
