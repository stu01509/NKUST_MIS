
public class E19_DiamondDraw {

	public static void main(String[] args) {
		
		System.out.println("E19. 菱形繪製");
		
		int n = 4;
	    for (int i = 1 ; i <= n ; i++){
	    
	        for (int j = 1 ; j <= n - i ; j++){
	          System.out.print(" ");
	        }
	            
	        for (int k = 1 ; k <= 2 * i- 1 ; k++){
	          System.out.print("*");
	        }
	            
	        System.out.println();
	    }
	    
	    for (int i = n -1 ; i >= 0 ; i--){
		    
	        for (int j = 1 ; j <= n - i ; j++){
	          System.out.print(" ");
	        }
	            
	        for (int k = 1 ; k <= 2 * i - 1 ; k++){
	          System.out.print("*");
	        }
	            
	        System.out.println("");
	    }
		
	}
	
}
