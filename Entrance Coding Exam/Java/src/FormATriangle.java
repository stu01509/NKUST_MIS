import java.util.Scanner;

public class FormATriangle {

	public static void main(String[] args) {
		
		System.out.println("6. 能否構成三角形");
		System.out.println("請輸入三邊長.");
		
		Scanner scanner = new Scanner(System.in);
		
		int sideOne = scanner.nextInt();
		int sideTwo = scanner.nextInt();
		int sideThree = scanner.nextInt();
	
		if(sideOne + sideTwo > sideThree && sideTwo + sideThree > sideOne & sideThree + sideOne > sideTwo) {
			
			System.out.println("fit");			
		}else {
			System.out.println("unfit");
		}
		
	}
	
}
