import java.util.Scanner;

public class SalaryCalculation {

	public static void main(String[] arg) {
		
		System.out.println("11. 薪資計算機");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("請輸入人數.");
		int inputPerson = Integer.valueOf(scanner.nextLine());
		

		for(int i = 0; i < inputPerson; i++) {
			
			System.out.println("請輸入時數 時薪 工作日.");
			
			int startH = scanner.nextInt(); 
			int startM = scanner.nextInt();
			int endH = scanner.nextInt();
			int endM = scanner.nextInt();
			int money  = scanner.nextInt();
			int workDay  = scanner.nextInt();
			
			if(endM - startM > 0){
				endH++;
	        }
			
			System.out.println((((endH - startH ) * money) * workDay));
		}
	}
	
}
