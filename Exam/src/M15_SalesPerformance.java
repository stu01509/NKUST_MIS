import java.util.Scanner;

public class M15_SalesPerformance {

	public static void main(String[] args) {
		
		System.out.println("M15. 銷售員業績");
		
		int[][] performance = {{33, 32, 56, 45, 33},
							   {77, 33, 68, 45, 23},
							   {43, 55, 43, 67, 65}};
		
		int[] price = {12, 16, 10, 14, 15};
		
		for (int i = 0; i < performance.length; i++) {
			
			System.out.print("銷售員" +  (i + 1) + "的銷售量為");
			for (int j = 0; j < performance[i].length; j++) {
				System.out.print(performance[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		System.out.println("(a)每個銷售員銷售總金額如下: ");		
		for (int i = 0; i < performance.length; i++) {
			
			System.out.println("銷售員 " +  (i + 1) + "的銷售總金額 " + ((performance[i][0] * 12) + (performance[i][1] * 16) +
					(performance[i][2] * 10) + (performance[i][3] * 14) + (performance[i][4] * 15)));
		}
		System.out.println("");
		
		System.out.println("(b)每項產品銷售總金額如下: ");		
		for (int i = 0; i < performance[0].length; i++) {
			
			System.out.println("產品  " + num2str(i + 1) + "的銷售總金額 " + (performance[0][i] + performance[1][i] + performance[2][i]) * price[i]);
			
		}
		System.out.println("");
		
		System.out.print("(c)業績最好的銷售員: ");
		
		int s1 = performance[0][0] + performance[0][1] + performance[0][2] + performance[0][3] + performance[0][4];  
		int s2 = performance[1][0] + performance[1][1] + performance[1][2] + performance[1][3] + performance[1][4];
		int s3 = performance[2][0] + performance[2][1] + performance[2][2] + performance[2][3] + performance[2][4];
		
		
		if (s1 > s2 && s1 > s3) {
			System.out.println("銷售員 1");
		} else if (s2 > s1 && s2 > s3) {
			System.out.println("銷售員 2");
		} else if (s3 > s1 && s3 > s2) {
			System.out.println("銷售員 3");
		}
		System.out.println("");
		
		System.out.print("(d)銷售金額最多的產品:");
		
		int p1 = (performance[0][0] + performance[1][0] + performance[2][0]) * 12;
		int p2 = (performance[0][1] + performance[1][1] + performance[2][1]) * 16;
		int p3 = (performance[0][2] + performance[1][2] + performance[2][2]) * 10;
		int p4 = (performance[0][3] + performance[1][3] + performance[2][3]) * 14;
		int p5 = (performance[0][4] + performance[1][4] + performance[2][4]) * 15;
		
		String[][] money = {{String.valueOf(p1), "A"},
							{String.valueOf(p2), "B"},
							{String.valueOf(p3), "C"},
							{String.valueOf(p4), "D"},
							{String.valueOf(p5), "E"}};
		
		for (int i = 0; i < money.length; i++) {
			
			for (int j = 0; j < money.length - 1; j++) {
				
				if (Integer.valueOf(money[j][0]) < Integer.valueOf(money[j + 1][0])) {
					
					String tempPrice = money[j][0];
					String tempType = money[j][1];
					
					money[j][0] = money[j + 1][0];
					money[j][1] = money[j + 1][1];
					
					money[j + 1][0] = tempPrice;
					money[j + 1][1] = tempType;
				}
				
			}
			
		}
		
		for (int i = 0; i < 1; i++) {
			System.out.println("產品" + money[i][1]);
		}
		
		
	}
	
	
	public static String num2str(int n) {
		
		String type = "";
		
		if (n == 1) {
			type = "A";
		} else if (n == 2) {
			type = "B";
		} else if (n == 3) {
			type = "C";
		} else if (n == 4) {
			type = "D";
		} else if (n == 5) {
			type = "E";
		} 
		
		return type;
		
	}
	
}
