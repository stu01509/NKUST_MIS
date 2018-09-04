using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Standard_Body_Weight_Calc
{
    class Program
    {
        static void Main(string[] args)
        {
            String inputValue, clearlyValue, male ,female;
            double double_male, double_female;
            int int_inputHeight , int_inputSex;


            Console.WriteLine("標準體重計算\r\n");
            Console.WriteLine("請輸入身高與性別.");
            inputValue = Console.ReadLine();

            clearlyValue = inputValue.Replace(" ", "");

            int_inputSex = Convert.ToInt32(clearlyValue.Substring(clearlyValue.Length - 1,1));
            int_inputHeight = Convert.ToInt32(clearlyValue.Substring(0, clearlyValue.Length - 1));


            if (int_inputSex == 1)
            {
                double_male = (int_inputHeight - 80) * 0.7;
                male = double_male.ToString("f1");
                Console.WriteLine(male);
            }
            else if(int_inputSex == 2)
            {
                double_female = (int_inputHeight - 70) * 0.6;
                female = double_female.ToString("f1");
                Console.WriteLine(female);
            }
            else
            {
                Console.WriteLine("請輸入正確身高與性別喔 Bye Bye");
            }      
            Console.ReadLine();

        }
    }
}
