import java.util.Scanner;

public class E8_Sort {

	public static void main(String[] args) {
		
		System.out.println("E8. 排序");		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("請輸入整數筆數：");
		int input = Integer.valueOf(scanner.nextLine());
		
		System.out.print("請輸入 " + input + " 筆整數");
		String[] inputValue = scanner.nextLine().split(" ");
				
        for (int i = 0; i < inputValue.length; i ++) {
        	
        	for (int j = 0; j < inputValue.length - 1; j++) {
        		
        		if (Integer.valueOf(inputValue[j]) > Integer.valueOf(inputValue[j + 1])) {
        			
        			String temp = inputValue[j];
        			
        			inputValue[j] = inputValue[j + 1];
        			inputValue[j + 1] = temp;
        			        			
        		}
        		
        	}
        	
        }
        
        System.out.print("排序後：");
        for (int i = 0; i < inputValue.length; i++) {
        	System.out.print(inputValue[i] + " ");
        }

	}
	
}
