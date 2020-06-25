import java.text.DecimalFormat;
import java.util.Scanner;

public class StandardBodyWeightCalc {

	public static void main(String[] args) {
		
		System.out.println("2. 標準體重計算");
		System.out.println("請輸入身高與性別.");
		
		Scanner scanner = new Scanner(System.in);

		int height = scanner.nextInt();
        int sex = scanner.nextInt();
		
        double ans = 0.0;
        
        if(sex == 1) {
        	ans = (height - 80) * 0.7;
        }else if(sex == 2) {
        	ans = (height - 70) * 0.6;
        }
        
        DecimalFormat df = new DecimalFormat("0.0");   
        String outputAns = df.format(ans);
        
        System.out.println(outputAns);

	}
	
}
