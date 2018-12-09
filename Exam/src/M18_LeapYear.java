import java.util.Scanner;

public class M18_LeapYear {

	public static void main(String[] args) {
		
		System.out.println("M18. 閏年判斷");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("請輸入西歷年: ");
		int year = scanner.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 && year % 3200 != 0)) {
			
			System.out.println(year + "是閏年");
		} else {
			
			System.out.println(year + "不是閏年");
		}
	}
	
}
