import java.util.Scanner;

public class E3_StringReplace {

	public static void main(String[] args) {
		
		System.out.println("E3. 字元更換");
		System.out.print("請輸入全部字元：");
		
		Scanner scanner = new Scanner(System.in);
		String[] inputValue = scanner.nextLine().split("");
		
		System.out.print("請輸入第幾個字元及要替換的字元：");
		String[] inputParm = scanner.nextLine().split(" ");
		
		Replace(inputValue, Integer.valueOf(inputParm[0]), inputParm[1]);
		
	}
	
	public static void Replace(String inputValue[], int digit, String change) {
				
		String[] inputReplace = inputValue;
		inputReplace[digit - 1] = change;
		
		for(int i = 0; i < inputReplace.length; i++) {
			System.out.print(inputReplace[i]);
		}
	}
}
