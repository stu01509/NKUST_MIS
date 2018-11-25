import java.util.Scanner;

public class E14_SantaClausAndReindeer {

	public static void main(String[] args) {
		
		System.out.println("E14. 聖誕老人與馴鹿");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入頭的數量.");
		int head = Integer.valueOf(scanner.nextLine());
		System.out.println("請輸入腳的數量.");
		int foot = Integer.valueOf(scanner.nextLine());
			
	
        int y1 = (foot - (head * 2)) / 2;
        int x1 = head - y1;
        
        System.out.println(x1 + " " + y1);
        System.out.println("聖誕老人共有 " + x1 + " 位");
        System.out.println("馴鹿共有 " + x1 + " 隻");
		
	}
	
}
