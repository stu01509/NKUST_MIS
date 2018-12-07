import java.util.Scanner;

public class M11_TaiwanReceiptLottery {
	
	public static int specialTimes = 0;
	public static int firstTimes = 0;
	public static int twoTimes = 0;
	public static int threeTimes = 0;
	public static int fourTimes = 0;
	public static int fiveTimes = 0;
	public static int sixTimes = 0;
	
	public static void main(String[] args) {
		
		System.out.println("M11. 統一發票對獎");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("輸入特獎號碼：");		
		int special = Integer.valueOf(scanner.nextLine());
		
		System.out.print("輸入頭獎號碼：");
		String[] first = scanner.nextLine().split(" ");
		
		System.out.print("輸入有幾張發票 n：");
		int value = scanner.nextInt();
		
		int[] receipts = new int [value];
		System.out.print("依序輸入 n 張發票號碼：");
		
		for (int i = 0; i < receipts.length; i++) {
			receipts[i] = scanner.nextInt();
		}
		
		
		checkSpecial(special, receipts);
		checkFirst(first, receipts);
		
		if (specialTimes != 0) {
			System.out.println("特獎：" + specialTimes);
		}		
		if (firstTimes != 0) {
			System.out.println("頭獎：" + firstTimes);
		}
		if (twoTimes != 0) {
			System.out.println("二獎：" + twoTimes);
		}
		if (threeTimes != 0) {
			System.out.println("三獎：" + threeTimes);
		}
		if (fourTimes != 0) {
			System.out.println("四獎：" + fourTimes);
		}
		if (fiveTimes != 0) {
			System.out.println("五獎：" + fiveTimes);
		}
		if (sixTimes != 0) {
			System.out.println("六獎：" + sixTimes);
		}
		
		System.out.println("共得  " + bonusCalc(specialTimes, firstTimes, twoTimes, threeTimes, fourTimes, fiveTimes, sixTimes) + " 元");
	}
	
	public static void checkSpecial(int specialNum, int[] receipts) {
	
		for (int i = 0; i < receipts.length; i++) {
			
			if (specialNum == receipts[i]) {
				specialTimes++;
			}
			
		}
		
	}
	
	public static void checkFirst(String[] firstNum, int[] receipts) {

		String[] receiptsNum = new String[receipts.length];
		
		for (int i = 0; i < receipts.length; i++) {
			receiptsNum[i] = String.valueOf(receipts[i]);
		}
		
		for (int i = 0; i < receiptsNum.length; i++) {
						
			for (int j = 0; j < firstNum.length; j++) {
				
				if (receiptsNum[i].substring(0).equals(firstNum[j].substring(0))) {
					firstTimes++;
					
				} else if (receiptsNum[i].substring(1).equals(firstNum[j].substring(1))) {
					twoTimes++;
					
				} else if (receiptsNum[i].substring(2).equals(firstNum[j].substring(2))) {
					threeTimes++;
					
				} else if (receiptsNum[i].substring(3).equals(firstNum[j].substring(3))) {
					fourTimes++;
					
				} else if (receiptsNum[i].substring(4).equals(firstNum[j].substring(4))) {
					fiveTimes++;
					
				} else if (receiptsNum[i].substring(5).equals(firstNum[j].substring(5))) {
					sixTimes++;
				}				
				
			}			
			
		}		
		
	}
	
	public static int bonusCalc(int sp, int st, int two, int three, int four, int five, int six) {
		
		return (sp * 2000000) + (st * 200000) + (two * 40000) + (three * 10000) + (four * 4000) + (five * 1000) + (six * 200);
		
	}
	
}
