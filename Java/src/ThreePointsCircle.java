import java.text.DecimalFormat;
import java.util.Scanner;

public class ThreePointsCircle {

	public static void main(String[] args) {
		
		System.out.println("三點求圓");
		System.out.println("請輸入座標位置.");
		
		Scanner scanner = new Scanner(System.in);
		
		String[] inputOne = scanner.nextLine().split(" ");
		String[] inputTwo = scanner.nextLine().split(" ");
		String[] inputThree = scanner.nextLine().split(" ");

        double x1 = Double.valueOf(inputOne[0]);
        double y1 = Double.valueOf(inputOne[1]);
        double x2 = Double.valueOf(inputTwo[0]);
        double y2 = Double.valueOf(inputTwo[1]);
        double x3 = Double.valueOf(inputThree[0]);
        double y3 = Double.valueOf(inputThree[1]);

        //重心
        double centroidX = 0;
        double centroidY = 0;

        centroidX = (x1 + x2 + x3) / 3;
        centroidY = (y1 + y2 + y3) / 3;


        //內心
        double incircleA = 0;
        double incircleB = 0;
        double incircleC = 0;
        double incircleSum = 0;
                    
        double incircleX = 0;
        double incircleY = 0;


        incircleA = Math.sqrt(Math.pow(Math.abs((x2 - x3)), 2) + Math.pow(Math.abs((y2 - y3)), 2));
        incircleB = Math.sqrt(Math.pow(Math.abs((x1 - x3)), 2) + Math.pow(Math.abs((y1 - y3)), 2));
        incircleC = Math.sqrt(Math.pow(Math.abs((x2 - x1)), 2) + Math.pow(Math.abs((y2 - y1)), 2));
        incircleSum = incircleA + incircleB + incircleC;

        
        incircleX = ((incircleA * x1) + (incircleB * x2) + (incircleC * x3)) / incircleSum;
        incircleY = ((incircleA * y1) + (incircleB * y2) + (incircleC * y3)) / incircleSum;


        //外心
        double cosA = (Math.pow(incircleB, 2) + Math.pow(incircleC, 2) - Math.pow(incircleA, 2)) / (2 * incircleB * incircleC);
        double cosB = (Math.pow(incircleC, 2) + Math.pow(incircleA, 2) - Math.pow(incircleB, 2)) /( 2 * incircleA * incircleC);
        double cosC = (Math.pow(incircleB, 2) + Math.pow(incircleA, 2) - Math.pow(incircleC, 2)) /( 2 * incircleA * incircleB);
        double centerX = (x1 * incircleA * cosA + x2 * incircleB * cosB + x3 * incircleC * cosC) / ( incircleA * cosA +  incircleB * cosB +  incircleC * cosC);
        double centerY = (y1 * incircleA * cosA + y2 * incircleB * cosB + y3 * incircleC * cosC) / (incircleA * cosA + incircleB * cosB + incircleC * cosC);

        DecimalFormat df = new DecimalFormat("0.000");   
        
        String centerXAns = df.format(centerX);
        String centerYAns = df.format(centerY);
        String centroidXAns = df.format(centroidX);
        
        
        System.out.println("圓心:" + centerXAns + "  " + centerYAns);
        System.out.println("半徑:" + centroidXAns);
	}
	
}
