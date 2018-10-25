import java.util.Scanner;

public class Q5 {
	
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入性別：");
        String sex = scanner.nextLine();
        System.out.print("輸入身高：");
        double height = Double.valueOf(scanner.nextLine());
        
        if(sex.equals("M")){
            System.out.println("你的標準體重應維持在 " + (height - 80) * 0.7 + " 公斤。");
        }else if(sex.equals("F")){
            System.out.println("你的標準體重應維持在 " + (height - 70) * 0.6 + " 公斤。");
        }
    }    
}
