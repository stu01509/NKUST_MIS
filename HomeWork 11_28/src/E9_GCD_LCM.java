import java.util.Scanner;

public class E9_GCD_LCM {

	public static void main(String[] args) {
		
		System.out.println("E9. そ计籔そ计");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("块タ俱计 1");
		int num1 = Integer.valueOf(scanner.nextLine());
		System.out.print("块タ俱计 2");
		int num2 = Integer.valueOf(scanner.nextLine());
		
		int gcd = 0;
		int lcm = 0;
		
		for (int i = 1; i <= num1 && i <= num2; i++) {
			
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
			
		}
		
		lcm = (num1 * num2) / gcd;
		
		System.out.println(num1 + "籔" + num2 + "そ计琌" + gcd);
		System.out.println(num1 + "籔" + num2 + "そ计琌" + lcm);
	}
	
}
