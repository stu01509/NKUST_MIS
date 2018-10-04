import java.text.DecimalFormat;
import java.util.Scanner;

public class ElectricityPricingCalc {

	public static void main(String[] args) {
		
		System.out.println("計算電費");
		System.out.println("請輸入使用度數.");
		
		Scanner scanner = new Scanner(System.in);
		int inputWatt = scanner.nextInt();
		
		double[] summer = new double[]{2.10, 3.02, 4.39, 4.97, 5.63};
		double[] nosummer = new double[]{2.10, 2.68, 3.61, 4.01, 4.50};
		
		double summerPrice = 0.0d;
		double nosummerPrice = 0.0d;
		
		if(inputWatt < 120) {
			summerPrice = inputWatt * summer[0];
			nosummerPrice = inputWatt * nosummer[0];
			
		}else if(inputWatt <= 330) {
			summerPrice = inputWatt * summer[1];
			nosummerPrice = inputWatt * nosummer[1];
			
		}else if(inputWatt <= 500) {
			summerPrice = inputWatt * summer[2];
			nosummerPrice = inputWatt * nosummer[2];
			
		}else if(inputWatt <= 700) {
			summerPrice = inputWatt * summer[3];
			nosummerPrice = inputWatt * nosummer[3];
			
		}else
        {
			summerPrice = inputWatt * summer[4];
			nosummerPrice = inputWatt * nosummer[4];
        }
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Summer months:" + df.format(summerPrice));
		System.out.println("Non-Summer months:" + df.format(nosummerPrice));
	}
}
