import java.util.Scanner;

public class M5_AccumulatedAmountCalculation {

	public static void main(String[] args) {
		
		System.out.println("M5. 本利和計算");		
		Scanner scanner = new Scanner(System.in);
//		本金
		System.out.print("請輸入本金：");
		double p = scanner.nextDouble(); 
//		月利率
		System.out.print("請輸入月利率： ");
		double r = scanner.nextDouble(); 
//		存款期數
		System.out.print("請輸入存款期數：");
		int n = scanner.nextInt(); 	
		
//		本利和
		double t = p * Math.pow((1 + r), n);
		
		System.out.println("本利和為 : " + t);
		
	}
	
}
