import java.util.Scanner;

public class M16_Fibonacci {

	public static void main(String[] args) {
		
		System.out.println("M16. 費氏數列");

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("請輸入第 n 個費氏數列的值: ");
		
		int inputN = Integer.valueOf(scanner.nextLine());
		
		System.out.println("費氏數列的總值 fib(" + inputN + ") = " + fib(inputN));

	}
	
	public static long fib(int n) {
		
		if(n == 1 || n== 2) {
			return 1;
		}else {
			return fib(n - 1) + fib(n - 2);
		}
		
	}

}
