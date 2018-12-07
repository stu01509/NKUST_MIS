import java.util.Scanner;

public class M10_MVPBasketBallPlayer {

	public static void main(String[] args) {
		
		System.out.println("M10. MVP 籃球員");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("輸入籃球員人數 (1~10)：");
		int player = Integer.valueOf(scanner.nextLine());
				
		String[] level = new String[player];
		
		for (int i = 0; i < player; i++) {
			
			System.out.print("籃球員 " +  (i + 1) + " (得分、助攻、籃板、抄截、失誤)：");
			String[] playerDetail = scanner.nextLine().split(" ");
			
			int score = 0;
			
			score = Integer.valueOf(playerDetail[0]) + (Integer.valueOf(playerDetail[1]) * 2) + 
					(Integer.valueOf(playerDetail[2]) * 2) + (Integer.valueOf(playerDetail[3]) * 2) -
					(Integer.valueOf(playerDetail[4]) * 2); 
			
			if (score > 45) {
				level[i] = "A";
			} else if (score >= 35) {
				level[i] = "B";
			} else if (score >= 25) {
				level[i] = "板凳";
			} else if (score < 25) {
				level[i] = "萬年板凳";
			}
		}
		
		for (int i = 0; i < level.length; i++) {
			
			System.out.println("籃球員 " + (i + 1) + " : " + level[i] + " 級球員");
			
		}		
		
	}
	
}
