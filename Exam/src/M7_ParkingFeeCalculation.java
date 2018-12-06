import java.util.Scanner;

public class M7_ParkingFeeCalculation {

	public static void main (String[] args) {
		
		System.out.println("M7. 停車費計算");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("開始停車時間：");
		String[] startTime = scanner.nextLine().split(" ");
		System.out.print("結束停車時間：");
		String[] endTime = scanner.nextLine().split(" ");
		
		
		int totalMin = 0;
		int price = 0;
		
		totalMin += (Integer.valueOf(endTime[0]) - Integer.valueOf(startTime[0])) * 60;
		
		if (Integer.valueOf(endTime[1]) - Integer.valueOf(startTime[1]) < 0) {
			totalMin -= Math.abs(Integer.valueOf(endTime[1]) - Integer.valueOf(startTime[1]));
		} else {
			totalMin += Integer.valueOf(endTime[1]) - Integer.valueOf(startTime[1]);
		}
		
		
		if (totalMin >= 240) {
			price += 280;
			
			totalMin -= 240;
			
			price += ((int)(totalMin / 30)) * 60;
		} else if (totalMin < 240 && totalMin > 120) {
			price += 120;
			
			totalMin -= 120;
			price += ((int)(totalMin / 30)) * 40;
		} else {
			
			price += ((int)(totalMin / 30)) * 30;
		}
		
		System.out.println("停車費用：" + price + "元");
	
		
	}
	
}
