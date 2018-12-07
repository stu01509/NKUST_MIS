import java.util.Scanner;

public class M13_PredictLotteryNumber {

	public static void main(String[] args) {
		
		System.out.println("M13. 預測樂透彩號碼");		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("請輸入 N :");
		int inputN = scanner.nextInt();
		
//		Initialize Array  49    
//		lottery[0][0] index
//		lottery[0][1] value		
		int[][] lottery = new int[50][2];

//		Random Number		
		for (int i = 0; i < inputN; i++) {		
			
			lottery[(int)Math.round(Math.random() * 48) + 1][1]++;		
		}
		
//		Add Index to Array		
		for (int i = 0; i < 50; i++) {
			lottery[i][0] = i;
		}
		
//		Sort Number by Times		
		for (int i = 0; i <= lottery.length; i++) {
			
			for (int j = 0; j < lottery.length - 1; j++) {
				
				if (lottery[j][1] < lottery[j + 1][1]) {
					
					int tempIndex = lottery[j][0];
					int tempTimes = lottery[j][1];
					
					
					lottery[j][0] = lottery[j + 1][0];
					lottery[j][1] = lottery[j + 1][1];
					
					lottery[j + 1][0] = tempIndex;
					lottery[j + 1][1] = tempTimes;
					
				}
				
			}
			
		}
		System.out.println("樂透彩機率最高的六個號碼為:");
		
		for (int i = 0; i < 6; i++) {
			
//			If Number < 10 to add 0
//			7 > 07
			if (lottery[i][0] < 10) {
				System.out.println("0" + lottery[i][0] + " > " + lottery[i][1] + "次");
				
			}else {				
				System.out.println(lottery[i][0] + " > " + lottery[i][1] + "次");
				
			}
			
		}
	
	}
	
}
