import java.util.Scanner;

public class E17_LeastDistanceBetweenTwoNumber {

	static int count = 0;
	static int[] ans = new int[1000];
	
	public static void main(String[] args) {
				
		System.out.println("E17. 兩數間小距離 ");
		findDistance();
		
	}
	
	public static void findDistance() {
		
		Scanner scanner = new Scanner(System.in);
		int input = Integer.valueOf(scanner.nextLine());
			
		if (input == 0) {
			for (int i = 0; i < count; i++) {
				System.out.println(ans[i]);
			}
		} else {
			String[] inputData = scanner.nextLine().split(" ");
			
			int min = 1000;
			
			for (int i = 0; i < inputData.length - 1; i++) {
	
				if ((Math.abs(Integer.valueOf(inputData[i]) - Integer.valueOf(inputData[i + 1])) < min)){
					min = Math.abs(Integer.valueOf(inputData[i]) - Integer.valueOf(inputData[i + 1]));
				}

			}
			
			if ((Math.abs(Integer.valueOf(inputData[inputData.length - 1]) - Integer.valueOf(inputData[0])) < min)){
				min = Math.abs(Integer.valueOf(inputData[inputData.length - 1]) - Integer.valueOf(inputData[0]));
			}
			
			ans[count] = min;

			count++;
			findDistance();
		}	
		

	}
	
}
