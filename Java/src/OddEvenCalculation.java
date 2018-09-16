import java.util.Scanner;

public class OddEvenCalculation {

	public static void main(String[] args) {
		
		System.out.println("案计畉璸衡");
		System.out.println("叫块计.");
		
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
			System.out.println(input + "ぇ案计畉 11 计 ");
		}else {
			System.out.println(input + "ぇ案计畉ぃ琌 11 计 ");
		}
		
		
	}
	
}
