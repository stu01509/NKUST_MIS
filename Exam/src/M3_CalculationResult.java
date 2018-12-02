import java.util.Scanner;

public class M3_CalculationResult {

	public static void main(String[] args) {
		
		System.out.println("M3. 計算結果");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("輸入 m：");
		int inputM = Integer.valueOf(scanner.nextLine());
		System.out.print("輸入 n：");
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
