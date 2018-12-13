import java.util.Scanner;

public class D4_BinarySearch {

	public static void main (String[] args) {
				
		System.out.println("D4. 二元搜尋法");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("未排序資料：");
		String[] data = scanner.nextLine().split(", ");
		
		System.out.print("請輸入要尋找的數字:");
		int find = scanner.nextInt();
		
//		Sort
		for (int i = 0; i < data.length; i++) {
			
			for (int j = 0; j < data.length -1; j++) {
				
				if (Integer.valueOf(data[j]) > Integer.valueOf(data[j + 1])) {
					
					String tempData = data[j];
					data[j] = data[j + 1];
					data[j + 1] = tempData;
					
				}
				
			}
			
		}
		
		System.out.print("排序後資料內容 :");
           
        for (int i = 0; i< data.length; i++) {
        	System.out.print(data[i] + " ");
        }

		System.out.println("數字" + find + "在第" + (binarySearch(data, find) + 1) + "個位置");

	}
	
	
	public static int binarySearch(String[] data, int findValue) {
		
//		最左邊的位置		
		int left = 0;
//		最右邊的位置
		int right = data.length - 1;
		
//				
		for (int i = left; i <= right; i++) {
			
//			如果很幸運的中間值就是我們所要的 直接回傳
			if (Integer.valueOf(data[(left + right) / 2]) == findValue) {
				return (left + right) / 2;
			}
			
//			如果中間值 大於我們所要的值 我們可以知道說 我們要的值 在位於 中間的左邊
			if (Integer.valueOf(data[(left + right) / 2]) > findValue) {
//				重新定義右邊的位置
				right = ((left + right) / 2) - 1; 
			}
			
//			如果中間值 小於我們所要的值 我們可以知道說 我們要的值 在位於 中間的右邊
			if (Integer.valueOf(data[(left + right) / 2]) < findValue) {
//				重新定義左邊的位置
				left = ((left + right) / 2) + 1; 
			}
						
		}
		
		return (left + right) / 2;
	}
	
}