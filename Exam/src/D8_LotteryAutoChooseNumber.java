import java.util.Scanner;

public class D8_LotteryAutoChooseNumber {

	public static void main(String[] args) {
		
		System.out.println("D8. 大樂透自動選號");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("請輸入自動選號組數 (1~3): ");
		int input = scanner.nextInt();
		
		int[][] numRandom = new int[input][6];
		
		for (int i = 0; i < input; i++) {
			numRandom[i] = getRandomNum();
		}

		System.out.println("本期大樂透號碼: 08 15 19 22 29 37 特別號：39。");
		
		for (int i = 0; i < numRandom.length; i++) {
			System.out.print("自動選號 " + (i + 1) + "為 : ");
			for (int j = 0; j < numRandom[i].length; j++) {
				System.out.print(numRandom[i][j] + " ");
			}
			System.out.println("");
		}
		
		int[] numNormal = {8, 15, 19, 22, 29, 37};
		int numSpecial = 39;
				
		int bingo = 0;
		int bingoSpecial = 0;
		
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < numRandom[i].length; j++) {
				if (numRandom[i][j] == numNormal[j]) {
					bingo++;
				}				

				if (numRandom[i][j] == numSpecial) {
					bingoSpecial++;
				}
			}
			
			if (bingo + bingoSpecial == 6) {
				System.out.println("!!!!! 恭喜您中了 1 組大樂透 頭獎 !!!!! ");
			} else if(bingoSpecial == 1){
				if (bingo == 5) {
					System.out.println("!!!!! 恭喜您中了 1 組大樂透 貳獎!!!!! ");
				} else if (bingo == 4) {
					System.out.println("!!!!! 恭喜您中了 1 組大樂透 肆獎!!!!! ");
				} else if (bingo == 3) {
					System.out.println("!!!!! 恭喜您中了 1 組大樂透 陸獎!!!!! ");
				} else if (bingo == 2) {
					System.out.println("!!!!! 恭喜您中了 1 組大樂透 柒獎!!!!! ");
				}
			} else {
				if (bingo == 5) {
					System.out.println("!!!!! 恭喜您中了 1 組大樂透 參獎!!!!! ");
				} else if (bingo == 4) {
					System.out.println("!!!!! 恭喜您中了 1 組大樂透 伍獎!!!!! ");
				}
			}
			
			bingo = 0;
			bingoSpecial = 0;
		}
		
	}
	
	public static int[] getRandomNum() {
		int[] num = new int[49];
		int[] result = new int[6];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = (i+1); 
		}
		
		for (int i = 0; i < num.length; i++) {
			int randomIndex = (int)Math.round(Math.random() * 47) + 1;
			int temp = num[i];
			num[i] = num[randomIndex];
			num[randomIndex] = temp;
		}		
		
		for (int i = 0; i < result.length; i++) {
			result[i] = num[i];
		}
		
		return result;
	}
}
