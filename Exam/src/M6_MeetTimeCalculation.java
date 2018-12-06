import java.util.Scanner;

public class M6_MeetTimeCalculation {
	
	public static void main(String[] args) {
		
		System.out.println("M6. 相遇時間計算");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("請輸入距離  (公尺)：");
		int distance = scanner.nextInt() * 100;
		
		double time = distance / (100 + 76.2);
		
		
		int h = (int)(time / 3600);
		time %= 3600;
		
		int m = (int)(time / 60);
		
		int s = (int)(Math.round(time % 60));
		
		
		if (h == 0) {
			System.out.println("兩人在  " + m + "分 " + s + "秒 會相遇 ");
		} else {
			System.out.println("兩人在  " + h + "時" + m + "分 " + s + "秒 會相遇 ");
		}
		
	}
	
}
