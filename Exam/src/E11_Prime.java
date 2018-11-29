import java.util.Scanner;

public class E11_Prime {

	public static void main(String[] args) {
		
		System.out.println("E11. 質數問題");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入整數:");
		
		int num = Integer.valueOf(scanner.nextLine());
		int check = 0;
		
		for (int i = 1 ; i <= num; i++) {
			
			if (num % i == 0) {
				check++;
			}
			
		}
		
		if (check == 2) {
			System.out.println(num + "是質數");
		} else {
			System.out.println(num + "不是質數 ");
		}
		
	}
	
}
