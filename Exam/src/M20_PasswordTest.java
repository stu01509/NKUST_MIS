import java.util.Scanner;

public class M20_PasswordTest {

	public static void main(String[] args) {
		
		System.out.println("M20. 密碼測試");
		Scanner scanner = new Scanner(System.in);
		
		int correctPwd = 1286;
		int loginTimes = 3;

		do {			
			System.out.print("請輸入密碼：");
			
			int inputPwd = scanner.nextInt();
			
			if (inputPwd == correctPwd) {
				
				System.out.println("密碼輸入正確，歡迎使用本系統!! ");
				break;
			} else {
				loginTimes--;
			}
			
		} while (loginTimes != 0);
		
		if (loginTimes == 0) {
			System.out.println("密碼輸入超過三次!!");
		}
		
	}
	
}
