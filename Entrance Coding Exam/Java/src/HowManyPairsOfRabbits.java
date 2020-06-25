import java.util.Scanner;

public class HowManyPairsOfRabbits {

	public static void main(String[] args) {
		System.out.println("3. 到底有幾對兔子?");
		System.out.println("請輸入月份.");

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		System.out.println(fib(month));
	}
	
	
	public static double fib(double num) {
		if(num == 1 || num == 2) {
			return 1;
		}else {
			return fib(num-1) + fib(num-2);    
		}
	}
	
}
