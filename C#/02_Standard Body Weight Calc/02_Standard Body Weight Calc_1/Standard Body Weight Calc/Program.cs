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
            String inputHeight, inputSex,male,female;
            int int_inputHeight, int_inputSex ;
            double double_male, double_female;
            Console.WriteLine("標準體重計算\r\n");
            Console.WriteLine("請輸入身高.");
            inputHeight = Console.ReadLine();
            Console.WriteLine("請輸入性別.");
            inputSex = Console.ReadLine();

            int_inputHeight = Convert.ToInt32(inputHeight);
            int_inputSex = Convert.ToInt32(inputSex);

            if(int_inputSex== 1)
            {
                double_male = (int_inputHeight - 80) *0.7;
                male = double_male.ToString("f1");
                Console.WriteLine(male);
            }
            else if(int_inputSex == 2){
                double_female = (int_inputHeight - 70) * 0.6;
                female = double_female.ToString("f1");
                Console.WriteLine(female);
            }
            else
            {
                Console.WriteLine("請輸入正確性別喔 Bye Bye");
            }
            Console.ReadLine();
        }
    }
}
