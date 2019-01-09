import java.util.Scanner;

public class D9_ArraySort {
	
	public static void main(String[] args) {
		
		System.out.println("D9. 陣列排序");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("輸入陣列個數：");
		int elements = scanner.nextInt();
		int[] a = new int[elements];
		int[] b = new int[elements];
	
		System.out.print("輸入整數陣列 a：");
		for (int i = 0; i < elements; i++) {
			a[i] = scanner.nextInt();
		}
		
		System.out.print("輸入整數陣列 b：");
		for (int i = 0; i < elements; i++) {
			b[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] < b[i]) {
				int temp = b[i];
				b[i] = a[i];
				a[i] = temp;
			}
		}
		
		System.out.print("排序後陣列 a：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println("");
		
		System.out.print("排序後陣列 b：");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
		
		
	}
	
}
