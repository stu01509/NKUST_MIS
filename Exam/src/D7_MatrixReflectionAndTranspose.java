import java.util.Scanner;

public class D7_MatrixReflectionAndTranspose {

	public static void main(String[] args) {
		
		System.out.println("D7. 矩陣反射與轉置");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("輸入矩陣的列元素個數：");		
		int col = scanner.nextInt();
		System.out.print("輸入矩陣的行元素個數：");
		int elements = scanner.nextInt();
		
		int[][] a = new int[col][elements];
		int[][] b = new int[col][elements];
		int[][] c = new int[elements][col];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("輸入矩陣的第" + (i + 1) + "行元素：");			
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[i][(a[i].length - 1) - j] = a[i][j];
				c[j][i] = a[i][j];
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println("");
		}

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
