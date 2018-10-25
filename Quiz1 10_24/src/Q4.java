import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入成績個數：");
        int input = Integer.valueOf(scanner.nextLine());
        System.out.print("請輸入成績：");
        
        String[] point = scanner.nextLine().split(" ");
        int sum = 0;
        double ave = 0.0;
        
        for(int i = 0; i < point.length; i++){
            sum += Integer.valueOf(point[i]);
        }
        
        ave = sum / point.length;
        
        System.out.println("總和：" + sum);
        System.out.println("平均：" + ave);
        System.out.println("等級:："); 
        
        for(int i = 0; i < point.length; i++){
        	
        	if(Integer.valueOf(point[i]) <= 19){
                System.out.println(point[i] + " = E");
            }else if(Integer.valueOf(point[i]) >= 20 && Integer.valueOf(point[i]) <= 39){
                System.out.println(point[i] + " = D");
            }else if(Integer.valueOf(point[i]) >= 40 && Integer.valueOf(point[i]) <= 59){
                System.out.println(point[i] + " = C");
            }else if(Integer.valueOf(point[i]) >= 60 && Integer.valueOf(point[i]) <= 79){
                System.out.println(point[i] + " = B");
            }else if(Integer.valueOf(point[i]) >= 80 && Integer.valueOf(point[i]) <= 100){
                System.out.println(point[i] + " = A");
            }
        	
        }      
    }    
	
}
