import java.util.Scanner;

public class LeastCommonMultiple {

	public static void main(String[] args) {
		
		System.out.println("22. 最小公倍數");
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入第 1 個數字.");
		int m = scanner.nextInt();
		System.out.println("請輸入第 2 個數字.");
		int n = scanner.nextInt();
		
		int gcd = 0;
		
		for(int i = 1; i <= m && i <=n; i++) {
			
			if(m % i == 0 && n % i==0) {
				
				gcd = i;
				
			}
			
		}
		
		int ans = (m * n) / gcd;
		
		System.out.println(ans);
	}
	
}
