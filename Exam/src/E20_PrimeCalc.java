import java.util.Scanner;

public class E20_PrimeCalc {

	public static void main(String[] args) {
		
		System.out.println("E20. 質因數計算");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("輸入正整數值 n:");
		int inputValue = Integer.valueOf(scanner.nextLine());
		int value = inputValue;
		int p = 0;
		
		int num = 2;
		
		System.out.print(inputValue + " = ");
		for (int i = 0; i <= inputValue; i++) {

			if (value % num == 0) {
				
				if (value == inputValue) {
					
				} else {
					System.out.print("*");
				}

				System.out.print(num);
				value = value / num;


			}else {
				num++;

			}

		}	
		
		
	}
	
}
