import java.text.DecimalFormat;
import java.util.Scanner;

public class Variance {

	public static void main(String[] args) {
		
		System.out.println("24. 變異數");
		System.out.println("請輸入數字.");
		
		Scanner scanner = new Scanner(System.in);
		String[] inputValue = scanner.nextLine().split(" ");
				
		double total = 0;
		double ave = 0;
		double diff = 0;
		double ans = 0;
		
		for (int i = 0; i < inputValue.length; i++) {
            total += Double.valueOf(inputValue[i]);
        }
		 
		ave = total / inputValue.length;
		 
		for(int i = 0; i < inputValue.length; i++) {
            diff += Math.pow((Double.valueOf(inputValue[i]) - ave), 2);
        }
		 
		ans = diff / inputValue.length;
		
		DecimalFormat df = new DecimalFormat("0.00");   
	    String outputAns = df.format(ans);
		
		System.out.println(outputAns);
	}
	
}
