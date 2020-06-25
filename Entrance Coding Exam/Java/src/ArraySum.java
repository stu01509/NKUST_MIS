import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		
		System.out.println("16. 陣列相加");
				
		Scanner scanner = new Scanner(System.in);
		int[][] arr1 = new int[3][3];
		int[][] arr2 = new int[3][3];
		int[][] ans = new int[3][3];
		
		System.out.println("請輸入陣列1.");
		for(int i = 0;i < 3;i++) {

			arr1[i][0] = scanner.nextInt();
			arr1[i][1] = scanner.nextInt();
			arr1[i][2] = scanner.nextInt();
		}
		
		System.out.println("請輸入陣列2.");
		for(int i = 0;i < 3;i++) {			

			arr2[i][0] = scanner.nextInt();
			arr2[i][1] = scanner.nextInt();
			arr2[i][2] = scanner.nextInt();
		}
		
		for(int i = 0; i < 3;i++) {
			ans[i][0] = add(arr1[i][0], arr2[i][0]);
			ans[i][1] = add(arr1[i][1], arr2[i][1]);
			ans[i][2] = add(arr1[i][2], arr2[i][2]);
			
			System.out.print(ans[i][0] + " ");
			System.out.print(ans[i][1] + " ");
			System.out.print(ans[i][2] + " ");
			System.out.println("");
		}
	}
	
	public static int add(int arr1, int arr2) {
		return arr1 + arr2;
	}
	
}
