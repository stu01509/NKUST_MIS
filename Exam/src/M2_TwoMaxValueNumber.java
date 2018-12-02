import java.util.Scanner;

public class M2_TwoMaxValueNumber {

	public static void main(String[] args) {
		
		
		System.out.println("M2. 程计");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("叫块皚计");
		int input = Integer.valueOf(scanner.nextLine());
		
		System.out.print("叫块皚");
		String[] inputValue = scanner.nextLine().split(" ");
		
		int master = 0;
		int second = 0;
		
		System.out.print("皚ず甧");
		for (int i = 0; i < inputValue.length; i++) {
			
			System.out.print(inputValue[i] + " ");
			if (Integer.valueOf(inputValue[i]) > second) {
				second = Integer.valueOf(inputValue[i]);
				
				if (second > master) {
					int temp = master;
					
					master = second;
					second = temp;
				}
			}
			
		}
		System.out.println("");
		System.out.print("程ㄢ计" + master + " " + second);
		
	}
	
}
