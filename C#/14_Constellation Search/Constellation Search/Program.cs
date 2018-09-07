using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Constellation_Search
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("星座查詢");
            Console.WriteLine("請輸入日期.");
            string[] date = Console.ReadLine().Split(' ');
            int month = Convert.ToInt32(date[0]);
            int day = Convert.ToInt32(date[1]);

            if(month == 01)
            {
                if(day <= 20)
                {
                    Console.WriteLine("Capricorn");
                }
                if(day >= 21)
                {
                    Console.WriteLine("Aquarius");
                }
            }
            if(month == 02)
            {
                if(day <= 18)
                {
                    Console.WriteLine("Aquarius");
                }
                if(day >= 19)
                {
                    Console.WriteLine("Pisces");
                }
            }
            if(month == 03)
            {
                if(day <= 20)
                {
                    Console.WriteLine("Pisces");
                }
                if(day >= 21)
                {
                    Console.WriteLine("Aries");
                }
            }
            if(month == 04)
            {
                if(day <=20)
                {
                    Console.WriteLine("Aries");
                }
                if(day >= 21)
                {
                    Console.WriteLine("Taurus");
                }
            }
            if(month == 05)
            {
                if(day <= 21)
                {
                    Console.WriteLine("Taurus");
                }
                if(day >= 22)
                {
                    Console.WriteLine("Gemini");
                }
            }
            if(month == 06)
            {
                if(day <= 21)
                {
                    Console.WriteLine("Gemini");
                }
                if(day >= 22)
                {
                    Console.WriteLine("Cancer");
                }
            }
            if(month == 07)
            {
                if(day <= 22)
                {
                    Console.WriteLine("Cancer");
                }
                if (day >=23) {
                    Console.WriteLine("Leo");
                }
            }
            if(month == 08)
            {
                if(day <= 23)
                {
                    Console.WriteLine("Leo");
                }
                if(day >= 24)
                {
                    Console.WriteLine("Virgo");
                }
            }
            if(month == 09)
            {
                if(day <= 23)
                {
                    Console.WriteLine("Virgo");
                }
                if(day >= 24)
                {
                    Console.WriteLine("Libra");
                }
            }
            if(month == 10)
            {
                if(day <= 23)
                {
                    Console.WriteLine("Libra");
                }
                if(day >= 24)
                {
                    Console.WriteLine("Scorpio");
                }
            }
            if(month == 11)
            {
                if(day <= 22)
                {
                    Console.WriteLine("Scorpio");
                }
                if(day >= 23)
                {
                    Console.WriteLine("Sagittarius");
                }
            }
            if(month == 12)
            {
                if(day <= 21)
                {
                    Console.WriteLine("Sagittarius");
                }
                if(day >= 22)
                {
                    Console.WriteLine("Capricorn");
                }
            }
            Console.ReadLine();
        }
    }
}
