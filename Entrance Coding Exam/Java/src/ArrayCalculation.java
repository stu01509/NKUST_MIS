import java.util.Scanner;

public class ArrayCalculation {

	public static void main(String[] args) {
		
		System.out.println("陣列計算");
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("請輸入第一筆數字.");
		String[]arr1 =scanner.nextLine().split("");
		System.out.println("請輸入第二筆數字.");
		String[]arr2 =scanner.nextLine().split("");
		
		String ans = "";

		
		for(int i = 0; i < arr1.length; i++) {
			if((Integer.valueOf(arr1[i]) + Integer.valueOf(arr2[i])) % 2 == 0) {
				ans += "0";
			}else {
				ans += "1";
			}
		}
		
		System.out.println(ans);
	}
	
}
