import java.util.Scanner;

public class OddEvenCalculation {

	public static void main(String[] args) {
		
		System.out.println("23. 奇偶數差計算");
		System.out.println("請輸入數字.");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] inputValue = input.split("");
		
		//A
		int odd = 0;
		//B
		int even = 0;
		
		for(int i = 0; i < inputValue.length; i++) {
			
			if(i % 2 == 0) {
				even += Integer.valueOf(inputValue[i]);
			}else if(i % 2 == 1) {
				odd += Integer.valueOf(inputValue[i]);
			}			
		}
		
		if(Math.abs(odd - even) % 11 == 0) {
			System.out.println(input + "之奇偶數差為 11 的倍數");
		}else {
			System.out.println(input + "之奇偶數差不是 11 的倍數");
		}
		
		
	}
	
}
