import java.util.Scanner;

public class Decryption {

	public static void main(String[] args) {
		
		System.out.println("7. 解密");
		System.out.println("請輸入Y.");
		
		Scanner scanner = new Scanner(System.in);
		
		String[] inputValue = scanner.nextLine().split("");
		
		int inputA = Integer.valueOf(inputValue[0]);
		int inputB = Integer.valueOf(inputValue[1]);
		int inputC = Integer.valueOf(inputValue[2]);
		int inputD = Integer.valueOf(inputValue[3]);
		
		String ans = "";
		
		for(int i = 0 ; i < 10; i++) {	
			
			if(inputA % 3 == 0) {
				
				ans += inputA / 3;
				break;
			}
			
			inputA +=10;

		}
		
		for(int i = 0 ; i < 10; i++) {			
			
			if(inputB % 3 == 0) {
				
				ans += inputB / 3;
				break;
			}
			
			inputB +=10;
		}
		
		for(int i = 0 ; i < 10; i++) {
						
			if(inputC % 3 == 0) {
				
				ans += inputC / 3;
				break;
			}
			
			inputC +=10;
		}
		
		for(int i = 0 ; i < 10; i++) {
						
			if(inputD % 3 == 0) {
				
				ans += inputD / 3;
				break;
			}
			
			inputD +=10;
		}
		
		System.out.println(ans);
	}
	
}
