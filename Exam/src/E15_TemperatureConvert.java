import java.text.DecimalFormat;
import java.util.Scanner;

public class E15_TemperatureConvert {

	public static void main(String[] args) {
		
		System.out.println("E15. 放锣传");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("叫块地ん放");
		double tempF = Double.valueOf(scanner.nextLine());
		
		double tempC = ((tempF - 32) * 5 ) / 9;
		
		DecimalFormat df = new DecimalFormat("#.#");
		String ans = df.format(tempC);   
		
		System.out.println("尼ん放 " + ans);
		
	}
	
}
