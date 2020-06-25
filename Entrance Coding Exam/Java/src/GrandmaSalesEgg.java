import java.util.Scanner;

public class GrandmaSalesEgg {

	public static void main(String[] args) {
		
		System.out.println("17. 阿婆賣蛋");
		System.out.println("請輸入數字.");
		Scanner scanner = new Scanner(System.in);
		int inputValue = scanner.nextInt();
		
		for(int i = 0; i < inputValue;i++) {

			if(i % 7 == 2 && i % 9 == 2 && i % 3 == 2) {
				System.out.println(i);
			}
			
		}
		
	}
	
}
