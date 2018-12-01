import java.util.Scanner;

public class E18_StandardWeight {

	public static void main(String[] args) {
		
		System.out.println("E18. 標準體重");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("請輸入性別：");
		String sex = scanner.nextLine();
		
		System.out.println("輸入身高：");		
		int height = scanner.nextInt();
		
		if (sex.equals("M")) {
			System.out.println("你的標準體重應維持在 " + (height - 80) * 0.7 + "公斤。");
		} else if(sex.equals("F")) {
			System.out.println("你的標準體重應維持在 " + (height - 70) * 0.6 + "公斤。");
		}
		
	}
	
}
