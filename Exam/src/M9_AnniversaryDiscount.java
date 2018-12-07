import java.util.Scanner;

public class M9_AnniversaryDiscount {

	public static void main(String[] args) {
		
		System.out.println("M9. 週年慶折扣");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("輸入一購物金額：");
		double price = Double.valueOf(scanner.nextLine());
		
		if (price >= 6000) {
			price *= 0.7;
		} else if (price >= 4000) {
			price *= 0.8;
		} else if (price >= 3000) {
			price *= 0.85;
		} else if (price < 3000) {
			price *= 0.9;
		}
		
		System.out.println("需付金額：" + Math.round(price));
		
	}
	
}
