import java.util.Scanner;

public class D3_MultipleLineCalculation {

	public static void main (String[] args) {
		
		System.out.println("D3. 多項式運算");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("輸入第一個多項式：");
		String[] lineOne = scanner.nextLine().split(" ");
		
		System.out.print("輸入第二個多項式：");
		String[] lineTwo = scanner.nextLine().split(" ");
		
		
		String[] ans = new String [lineOne.length + 2];
		
//		Defined for pow
		int pow = 4;
		
		for (int i = 0; i < lineOne.length; i++) {
			
//			不加次方符號
			if (pow <= 1) {
				
				if (pow < 1) {
					System.out.print((Integer.valueOf(lineOne[i]) + Integer.valueOf(lineTwo[i])));
				} else {
					System.out.print((Integer.valueOf(lineOne[i]) + Integer.valueOf(lineTwo[i])) + "x");
				}
				
			} else {
				System.out.print((Integer.valueOf(lineOne[i]) + Integer.valueOf(lineTwo[i])) + "x" + "^" + pow);
			}
			
//			不加 + 號
			if (i != lineOne.length -1) {
				System.out.print(" + ");
			}
			
			pow--;
			
		}
		
	}
	
}
