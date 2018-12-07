import java.util.Scanner;

public class M14_RecursionFormula {

	public static void main(String[] args) {
		
		System.out.println("M14. 遞迴方程式");		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("設 x 為");
		double inputX = scanner.nextDouble();
		
		System.out.println(power(inputX, 10));
				
	}
	
	public static double power(double x, int n) {
	
		double ans = 0.0d;
		
		for (int i = 0; i <= n; i++) {
			
			ans += (Math.pow(x, i) / (double)fact(i));			
		}
		return ans;		
	}
	
	public static long fact(int a) {
		
		if (a == 0 || a == 1) {
			return 1;
		} else {
			return a * fact(a - 1);
		}
	}
	
}
