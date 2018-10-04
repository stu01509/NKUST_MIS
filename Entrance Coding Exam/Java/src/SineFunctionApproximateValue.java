import java.text.DecimalFormat;
import java.util.Scanner;

public class SineFunctionApproximateValue {

	public static void main(String[] args) {
		
		System.out.println("求 sin 函數的近似值");
		System.out.println("請輸入 x 及 N");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		
		double sin = 0;

		for (int i = 0; i <= n; i++) {
            int g = 2 * i + 1;
            for (int j = 2 * i + 1; j > 0; j--) {            
                g = g * (2 * i + 1);
            }
            sin = sin + (Math.pow(-1, i) / g * Math.pow(x, 2 * n + 1));

        }
		
		DecimalFormat df = new DecimalFormat("0.00");   
        String outputAns = df.format(sin);
        
        System.out.println(outputAns);
	}
	
}
