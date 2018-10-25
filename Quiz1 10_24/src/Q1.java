import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入個數:");
        int inut = Integer.valueOf(scanner.nextLine());
        System.out.print("請輸入數值:");
        String[] inputValue = scanner.nextLine().split(" ");
       
        double total = 0.0;
        double ave = 0.0;
	    double diff = 0.0;
	    double ans = 0.0;		

        for(int i = 0; i < inputValue.length; i++) {
            total += Double.valueOf(inputValue[i]);
        }
        
        ave = total / inputValue.length;
	 
        for(int i = 0; i < inputValue.length; i++) {
            diff += Math.pow((Double.valueOf(inputValue[i]) - ave), 2);
        }
	 
        ans = diff / inputValue.length;

        System.out.println("變異數為 :" + ans);
        
	}
	
}
