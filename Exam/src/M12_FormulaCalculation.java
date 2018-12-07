import java.util.Scanner;

public class M12_FormulaCalculation {

	public static void main(String[] args) {
		
		System.out.println("M12. 方程式計算");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("請輸入 n :");
		int inputN = scanner.nextInt();		
		
		System.out.println(power(2, inputN));
	}
	
	public static double power(int value, int n) {
		
		double ans = 0.0d;
		
		for (int i = 1; i <= n; i++) {			
			ans += ((double)1 / Math.pow(value, i));			
		}
		
		return ans;		
	}
	
}
