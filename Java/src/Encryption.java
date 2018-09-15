import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		 
		System.out.println("數字加密");
		System.out.println("請輸入4位數字.");
		
		Scanner scanner = new Scanner(System.in);
		String inputValue[] = scanner.nextLine().split("");
		
		 int one = Integer.valueOf(inputValue[0]);
         int two = Integer.valueOf(inputValue[1]);
         int three = Integer.valueOf(inputValue[2]);
         int four = Integer.valueOf(inputValue[3]);
         
         int changedOne = (three + 7) % 10;
         int changedTwo = (four + 7) % 10;
         int changedThree = (one + 7) % 10;
         int changedFour = (two + 7) % 10;
         
         String ans = String.valueOf(changedOne) + String.valueOf(changedTwo) +
        		 String.valueOf(changedThree) +String.valueOf(changedFour);
		
         System.out.println(ans);
	}
	
}
