import java.util.Scanner;

public class E2_StringLengthCalcAndReverseDisplay {

	public static void main(String[] args) {
		
		System.out.println("E2. 字串長度計算及反向顯示");
		
		Scanner scanner = new Scanner(System.in);
		String[] inputValue = scanner.nextLine().split("");
		
		Length(inputValue);
		Reverse(inputValue);
		
	}
	
	public static void Length(String[] inputValue) {
		System.out.println("字串長度：" + inputValue.length);
	}
	
	public static void Reverse(String[] inputValue) {
		System.out.print("反轉後字串：");
		
		for (int i = inputValue.length - 1; i >= 0; i--) {
			System.out.print(inputValue[i]);
		}
	}
	
}
