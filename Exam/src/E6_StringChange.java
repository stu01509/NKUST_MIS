import java.util.Scanner;

public class E6_StringChange {

	public static void main(String[] args) {
		
		System.out.println("E6. ¦r¦êÅÜ´«");
		
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		
		String ans = "";
		
		for (int i = 0; i < inputValue.length(); i++) {
			
			
			int ascii = (int)inputValue.charAt(i);

			
			 if (48 <= ascii && ascii <= 57) {
                 ans += "0";
             }
			 
			 if (65 <= ascii && ascii <= 90) {
                 ans += inputValue.charAt(i);
             }
			 
			 if (97 <= ascii && ascii <= 122) {
                 int upperNumASCII= ascii - 32;
                 char upper =(char)upperNumASCII;
                 ans += String.valueOf(upper);
             }
		}
		System.out.println(ans);
	}	
		
		
}
	

