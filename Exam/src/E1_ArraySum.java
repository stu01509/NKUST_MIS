import java.util.Scanner;

public class E1_ArraySum {

public static void main(String[] args) {
		
		System.out.println("E1. 陣列相加");
				
		Scanner scanner = new Scanner(System.in);
		
		int[][] arr1 = new int[3][3];
		int[][] arr2 = new int[3][3];
		int[][] ans = new int[3][3];
		
		System.out.println("請輸入第 1 個陣列：");
		
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				arr1[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("請輸入第 2 個陣列： ");
		
		for (int i = 0; i < 3; i++) {		
			
			for (int j = 0; j < 3; j++) {
				arr2[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("陣列加總值：");
		
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {				
				ans[i][j] = add(arr1[i][j], arr2[i][j]);		
				System.out.print(ans[i][j] + " ");
			}
			
			System.out.println("");
		}
	}
	
	public static int add(int arr1, int arr2) {
		return arr1 + arr2;
	}
	
}
