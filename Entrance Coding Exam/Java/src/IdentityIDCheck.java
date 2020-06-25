import java.util.Scanner;

public class IdentityIDCheck {

	public static void main(String[] args) {
		
		System.out.println("27. 身分證字號識別");
		System.out.println("請輸入身分證字號.");
		
		Scanner scanner = new Scanner(System.in);
		String inputVaule = scanner.nextLine();
		
		char alpha = inputVaule.charAt(0);
		String code = "";		
			
		 switch (alpha) {
		 	
            case 'A':
                code = "10";
                break;
            case 'B':
                code = "11";
                break;
            case 'C':
                code = "12";
                break;
            case 'D':
                code = "13";
                break;
            case 'E':
                code = "14";
                break;
            case 'F':
                code = "15";
                break;
            case 'G':
                code = "16";
                break;
            case 'H':
                code = "17";
                break;
            case 'I':
                code = "34";
                break;
            case 'J':
                code = "18";
                break;
            case 'K':
                code = "19";
                break;
            case 'L':
                code = "20";
                break;
            case 'M':
                code = "21";
                break;
            case 'N':
                code = "22";
                break;
            case 'O':
                code = "35";
                break;
            case 'P':
                code = "23";
                break;
            case 'Q':
                code = "24";
                break;
            case 'R':
                code = "25";
                break;
            case 'S':
                code = "26";
                break;
            case 'T':
                code = "27";
                break;
            case 'U':
                code = "28";
                break;
            case 'V':
                code = "29";
                break;
            case 'W':
                code = "32";
                break;
            case 'X':
                code = "30";
                break;
            case 'Y':
                code = "31";
                break;
            case 'Z':
                code = "33";
                break;              
            default:
            	System.out.println("¿ù»~");
                break;
         }
		 		 
		 int total = 0;
		 
		 for(int i = 1; i < inputVaule.length(); i++)
         {
            
             total = (Character.getNumericValue(inputVaule.charAt(1)) * 8) +
                     (Character.getNumericValue(inputVaule.charAt(2)) * 7) +
                     (Character.getNumericValue(inputVaule.charAt(3)) * 6) +
                     (Character.getNumericValue(inputVaule.charAt(4)) * 5) +
                     (Character.getNumericValue(inputVaule.charAt(5)) * 4) +
                     (Character.getNumericValue(inputVaule.charAt(6)) * 3) +
                     (Character.getNumericValue(inputVaule.charAt(7)) * 2) +
                     (Character.getNumericValue(inputVaule.charAt(8)) * 1) +
                     (Character.getNumericValue(inputVaule.charAt(9)));
         }
		 
		 total += code.charAt(0);
		 total += code.charAt(1) * 9;

		 
		 String ans = total % 10 == 0 ? "正確" : "錯誤";
		 
		 System.out.println(ans);
	}
	
}
