import java.util.Scanner;

public class M17_PersonalIncomeTaxCalculation {

	public static void main(String[] args) {
		
		System.out.println("M17. 個人所得稅計算");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("請輸入個人所得:");
		int income = scanner.nextInt();
		
		double tax = 0;
		
		if (income > 3720000) {
			
			tax += (income - 3720000) * 0.4;
			income = 3720000;			
			tax += (income - 1980000) * 0.3;
			income = 1980000;
			tax += (income - 990000) * 0.21;
			income = 990000;
			tax += (income - 370000) * 0.13;
			income = 370000;
			tax += income * 0.06;

		} else if (income > 1980000) {
			
			tax += (income - 1980000) * 0.3;
			income = 1980000;
			tax += (income - 990000) * 0.21;
			income = 990000;
			tax += (income - 370000) * 0.13;
			income = 370000;
			tax += income * 0.06;
			
		} else if (income > 990000) {

			tax += (income - 990000) * 0.21;
			income = 990000;
			tax += (income - 370000) * 0.13;
			income = 370000;
			tax += income * 0.06;
			
		} else if (income > 370000) {

			tax += (income - 370000) * 0.13;
			income = 370000;
			tax += income * 0.06;
			
		} else if (income <= 37) {
			
			tax = (income * 0.06);
		}
		
		System.out.println("應繳稅額 =  " + Math.round(tax));
		
	}

}
