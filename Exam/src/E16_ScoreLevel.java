import java.util.Scanner;

public class E16_ScoreLevel {

	public static void main(String[] args) {
		
		System.out.println("E16. 分數等級");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("請輸入整數筆數 n：");
		int input = Integer.valueOf(scanner.nextLine());
		
		String[] inputData = new String[input];
		
		int sum = 0;
		
		for (int i = 0; i < input; i++) {
			
			inputData[i] = scanner.nextLine();
			sum += Integer.valueOf(inputData[i]);
		}
		
		double ave = sum / input;
		System.out.println("總和：" + sum);
		System.out.println("平均：" + ave);	
		
		String levelRange = "";
		
		for (int i = 0; i < inputData.length; i++) {			
				
			int levelNum = Integer.valueOf(inputData[i]);
			
			if (levelNum <= 19) {
				levelRange = "E";
				
			} else if (20 <= levelNum && levelNum <= 39){
				levelRange = "D";
				
			} else if (40 <= levelNum && levelNum <= 59){
				levelRange = "C";
				
			} else if (60 <= levelNum && levelNum <= 79){
				levelRange = "B";
				
			} else if (80 <= levelNum && levelNum <= 100){
				levelRange = "A";
			}
			
			System.out.println(levelNum + ": "+levelRange);
			
		}		
		

	}
	
}
