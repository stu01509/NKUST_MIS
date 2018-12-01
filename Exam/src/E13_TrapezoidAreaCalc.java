import java.util.Scanner;

public class E13_TrapezoidAreaCalc {

	public static void main(String[] args) {
		
		System.out.println("E13. 計算梯型面積");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("請輸入上底：");
		int topValue = Integer.valueOf(scanner.nextLine());
		
		System.out.println("請輸入下底：");
		int bottomValue = Integer.valueOf(scanner.nextLine());
		
		System.out.println("請輸入高：");
		int heightValue = Integer.valueOf(scanner.nextLine());
		
		double area = ((topValue + bottomValue) * heightValue) / 2;
		
		System.out.println("梯形面積為 " + area);
	}
	
}
