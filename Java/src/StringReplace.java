import java.util.Scanner;

public class StringReplace {

	public static void main(String[] args) {
		
		
		System.out.println("¦r¦êÅÜ´«");
		System.out.println("½Ð¿é¤J¦r¦ê.");
		Scanner scanner = new Scanner(System.in);
		
		String inputValue = scanner.nextLine();

		String ans = "";
		
		for(int i = 0; i< inputValue.length(); i++) {
			
			
			char character = inputValue.charAt(i);   
			
			int ascii = (int)character;

			
			 if(48 <= ascii && ascii <= 57) {
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
