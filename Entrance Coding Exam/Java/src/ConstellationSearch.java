import java.util.Scanner;

public class ConstellationSearch {

	public static void main(String[] args) {
		
		System.out.println("星座查詢");
		System.out.println("請輸入月及日期.");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		
		// 如果寫成 month == 01 的話, 會被視為八進制, 導致08 09出現錯誤
		// The literal 09 of type int is out of range
		if(month == 1){			
            if(day <= 20){            	
            	System.out.println("Capricorn");
            }
            if(day >= 21){            	
            	System.out.println("Aquarius");
            }
        }
		
        if(month == 2){        	
            if(day <= 18){            	
            	System.out.println("Aquarius");
            }
            if(day >= 19){            	
            	System.out.println("Pisces");
            }
        }
        
        if(month == 3){        	
            if(day <= 20){            	
            	System.out.println("Pisces");
            }
            if(day >= 21){            	
            	System.out.println("Aries");
            }
        }
        
        if(month == 4){
            if(day <=20){
            	System.out.println("Aries");
            }
            if(day >= 21){
            	System.out.println("Taurus");
            }
        }
        
        if(month == 5){
            if(day <= 21){
            	System.out.println("Taurus");
            }
            if(day >= 22){
            	System.out.println("Gemini");
            }
        }
        
        if(month == 6){
            if(day <= 21){
            	System.out.println("Gemini");
            }
            if(day >= 22){
            	System.out.println("Cancer");
            }
        }
        
        if(month == 7){
            if(day <= 22){
            	System.out.println("Cancer");
            }
            if (day >=23){
            	System.out.println("Leo");
            }
        }
        
        if(month == 8){
            if(day <= 23){
            	System.out.println("Leo");
            }
            if(day >= 24){
            	System.out.println("Virgo");
            }
        }
        
        if(month == 9){
            if(day <= 23){
            	System.out.println("Virgo");
            }
            if(day >= 24){
            	System.out.println("Libra");
            }
        }
        
        if(month == 10){
            if(day <= 23){
            	System.out.println("Libra");
            }
            if(day >= 24){
            	System.out.println("Scorpio");
            }
        }
        
        if(month == 11){
            if(day <= 22){
            	System.out.println("Scorpio");
            }
            if(day >= 23){
            	System.out.println("Sagittarius");
            }
        }
        
        if(month == 12){
            if(day <= 21){
            	System.out.println("Sagittarius");
            }
            if(day >= 22){
            	System.out.println("Capricorn");
            }
        }		
		
	}
	
}
