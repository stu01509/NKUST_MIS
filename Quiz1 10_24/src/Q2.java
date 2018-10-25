
public class Q2 {

	public static void main(String[] args) {
		
		double ans = 0.0;
        
        int i = 1;
        
        do{
            ans += (1 / Double.valueOf(i));            
            i++;
        }while(i <= 100);
        
        System.out.println(ans);

	}

}
