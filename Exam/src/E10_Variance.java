import java.text.DecimalFormat;
import java.util.Scanner;

public class E10_Variance {

	public static void main(String[] args) {
		
		System.out.println("E10. 變異數");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("請輸入整數筆數 ( 1 ≤ N ≤ 30)：");
		int input = Integer.valueOf(scanner.nextLine());
		
		System.out.print("請 輸入" + input + "筆整數：");
		String[] inputValue = scanner.nextLine().split(" ");
		
		double total = 0;
		double ave = 0;
		double diff = 0;
		double ans = 0;
		
		for (int i = 0; i < inputValue.length; i++) {
            total += Double.valueOf(inputValue[i]);
        }
		 
		ave = total / inputValue.length;
		 
		for (int i = 0; i < inputValue.length; i++) {
            diff += Math.pow((Double.valueOf(inputValue[i]) - ave), 2);
        }
		 
		ans = diff / inputValue.length;
		
		DecimalFormat df = new DecimalFormat("0.00");   
	    String outputAns = df.format(ans);
		
		System.out.println(input + "筆整數的變異數為：" + outputAns);
	
		
	}
	
}
