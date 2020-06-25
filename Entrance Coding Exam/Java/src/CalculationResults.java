import java.util.Scanner;

public class CalculationResults {

	public static void main(String[] args) {
		
		System.out.println("9. 計算結果");
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入m.");
		int inputM = Integer.valueOf(scanner.nextLine());
		System.out.println("請輸入n.");
		int inputN = Integer.valueOf(scanner.nextLine());
		
		
		int mResult = 1;
		int nResult = 1;
		int subResult = 1;
		
		for(int i = 1; i <= inputM; i++) {
			mResult *= i;
		}
		
		for(int i = 1; i <= inputN; i++) {
			nResult *= i;
		}
		
		for(int i = 1; i <= inputM - inputN; i++) {
			subResult *= i;
		}
		
		int ans = mResult / (nResult * subResult);
		
		System.out.println(ans);

		
		
	}
	
}
