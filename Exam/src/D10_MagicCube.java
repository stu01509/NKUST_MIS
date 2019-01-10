import java.util.Scanner;

public class D10_MagicCube {

	public static void main(String[] args) {
		
		System.out.println("D10. 魔術方塊");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("請輸入階數:");
		int input = scanner.nextInt();
		
		if (input == 0 || input > 15 || input % 2 == 0) {
			return;
		}
		
		int[][] arr = new int[input][input];
		
//		行中的第幾個
		int col = input / 2;
//		行
		int row = 0;
//		起始值
		int startIndex = 1;
		
		for (int i = 0; i < input; i++) {
			
			for (int j = 0; j < input; j++) {			
				
				if (row < 0) {
					row = input - 1;
				}
				if (col > input - 1 ) {
					col = 0;
				}				
				
				
				if (arr[row][col] != 0) {
//					如果在對角線兩側
					if (row == input - 1 && col == 0) {
						row = 1;
						col = input - 1;
					}else {
						row += 2;
						col--;
					}
					
					arr[row][col] = startIndex;
				} else {
					arr[row][col] = startIndex;
				}
				col++;
				row--;
				startIndex++;
			}
		}		
		
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input; j++) {
				if (arr[i][j] < 10) {
					System.out.print(" " + arr[i][j] + " ");
				} else {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println("");
		}
		
	}

}
