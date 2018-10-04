import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		
		System.out.println("猜數字");
		check();
	}
	
	public static void check() {
		
		//假設答案
        String ans = "1234";
        System.out.println("請輸入數字.");
        
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();
        
        int a = 0;
        int b = 0;
        
        if(inputValue.equals("0000")) {
        	return;
        }else {
        	
        	for(int i = 0; i < 4; i++) {
        		
        		if(inputValue.charAt(i) == ans.charAt(i)) {
                    a++;
                }
                else {
                	
                    for(int j = 0; j < 4; j++) {
                    	
                        if(inputValue.charAt(i) == ans.charAt(j)) {
                            b++;
                        }
                    }
                }
            }
        }
        
        System.out.println(a + "A" + b + "B");
        check();
	}
	
}
