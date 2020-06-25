import java.util.Scanner;

public class TelephoneFeeCalculation {

	public static void main(String[] args) {
		
		System.out.println("18. 電信費用的計算");
		System.out.println("請輸入秒數.");
		
		Scanner scanner = new Scanner(System.in);
		int inputValue = scanner.nextInt();
		
		
		double price = 0;

        if(inputValue <= 180) {
            price = inputValue * 0.16;
            
        }else if (181 <= inputValue  && inputValue <= 300) {
            price = (inputValue * 0.16) * 0.9;
            
        }else if (301 <= inputValue && inputValue <= 600) {
            price = (inputValue * 0.16) * 0.8;
            
        }else if (inputValue >= 600) {
            price = (inputValue * 0.16) * 0.7;
            
        }
        
        System.out.println(price);
	}
	
}
