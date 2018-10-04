using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Identity_ID_Check
{
    class Program
    {
        static void Main(string[] args)
        {

            Console.WriteLine("身分證字號識別");
            Console.WriteLine("請輸入身分證字號.");
            string inputID = Console.ReadLine();

            char alpha = inputID[0];
            string code = "";

            switch (alpha)
            {
                case 'A':
                    code = "10";
                    break;
                case 'B':
                    code = "11";
                    break;
                case 'C':
                    code = "12";
                    break;
                case 'D':
                    code = "13";
                    break;
                case 'E':
                    code = "14";
                    break;
                case 'F':
                    code = "15";
                    break;
                case 'G':
                    code = "16";
                    break;
                case 'H':
                    code = "17";
                    break;
                case 'I':
                    code = "34";
                    break;
                case 'J':
                    code = "18";
                    break;
                case 'K':
                    code = "19";
                    break;
                case 'L':
                    code = "20";
                    break;
                case 'M':
                    code = "21";
                    break;
                case 'N':
                    code = "22";
                    break;
                case 'O':
                    code = "35";
                    break;
                case 'P':
                    code = "23";
                    break;
                case 'Q':
                    code = "24";
                    break;
                case 'R':
                    code = "25";
                    break;
                case 'S':
                    code = "26";
                    break;
                case 'T':
                    code = "27";
                    break;
                case 'U':
                    code = "28";
                    break;
                case 'V':
                    code = "29";
                    break;
                case 'W':
                    code = "32";
                    break;
                case 'X':
                    code = "30";
                    break;
                case 'Y':
                    code = "31";
                    break;
                case 'Z':
                    code = "33";
                    break;              
                default:
                    Console.WriteLine("錯誤");
                    break;
            }

            int single = Convert.ToInt32(Convert.ToString(code[0]));
            int ten = Convert.ToInt32(Convert.ToString(code[1]));
            int total = 0;

            for(int i = 1; i < inputID.Length; i++)
            {
               
                total = Convert.ToInt32(Convert.ToString(inputID[1])) * 8 +
                        Convert.ToInt32(Convert.ToString(inputID[2])) * 7 +
                        Convert.ToInt32(Convert.ToString(inputID[3])) * 6 +
                        Convert.ToInt32(Convert.ToString(inputID[4])) * 5 +
                        Convert.ToInt32(Convert.ToString(inputID[5])) * 4 +
                        Convert.ToInt32(Convert.ToString(inputID[6])) * 3 +
                        Convert.ToInt32(Convert.ToString(inputID[7])) * 2 +
                        Convert.ToInt32(Convert.ToString(inputID[8])) * 1 +
                        Convert.ToInt32(Convert.ToString(inputID[9]));
            }

            total += Convert.ToInt32(Convert.ToString(code[0]));
            total += Convert.ToInt32(Convert.ToString(code[1])) * 9;

            string ans = total % 10 == 0 ? "正確" : "錯誤";

            Console.WriteLine(ans);

            Console.ReadLine();
        }
    }
}
