import java.util.Scanner;

public class GrandmaSalesEgg {

	public static void main(String[] args) {
		
		System.out.println("ªü±C½æ³J");
		System.out.println("½Ð¿é¤J¼Æ¦r.");		
		Scanner scanner = new Scanner(System.in);
		int inputValue = scanner.nextInt();
		
		for(int i = 0; i < inputValue;i++) {

			if(i % 7 == 2 && i % 9 == 2 && i % 3 == 2) {
				System.out.println(i);
			}
			
		}
		
	}
	
}
