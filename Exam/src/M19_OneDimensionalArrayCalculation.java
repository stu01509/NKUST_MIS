import java.util.Scanner;

public class M19_OneDimensionalArrayCalculation {

	public static void main(String[] args) {
		
		System.out.println("M19. 一維陣列計算");
		int[] a = {18,-51,23,35,10,9,-3,52,81,69};
		int[] b = {28,32,-35,40,73,17,92,32,13,29}; 
		
		int sum = 0;
		
		
		for (int i = 0; i < a.length; i++) {
			
			sum += a[i] * b[(b.length - 1) - i];			
		}
		
		System.out.print("陣列 a 內容: ");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		
		System.out.print("陣列 b 內容: ");
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println("");
		
		System.out.println("Sum = " + sum);
		
	}
	
}
