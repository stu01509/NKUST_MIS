import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		
		System.out.println("帕斯卡三角形");
		System.out.println("請輸入點的數量.");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int[][] inputData = new int [Integer.valueOf(input)][2]; 
		
		for(int i = 0; i < Integer.valueOf(input); i++) {
			
			System.out.println("請輸入點的位置.");
			String[] inputTemp = scanner.nextLine().split(", "); 
			
			inputData[i][0] = Integer.valueOf(inputTemp[0]);			
			inputData[i][1] = Integer.valueOf(inputTemp[1]);
		}
		
		
		for(int i = 0; i < Integer.valueOf(input); i++) {
			
			pascal(inputData[i][0] , inputData[i][1]);
		}
		
	}
	
	public static void pascal(int num, int position)
    {

        // 先將數字計算儲存至 Array
        //  如題目的 0 ≤ n ≤ 65, Array空間最大設為 67
        int[][] table = new int[67][67];

        table[0][0] = 1;

        for (int y = 1; y < 67; y++)
        {
            // 每列的起始與最後位皆為1
            table[y][0] = table[y - 1][0];

            for (int i = 1; i < 67; i++)
            {
                table[y][i] = table[y - 1][i] + table[y - 1][i - 1];
            }
        }

        int n = num;

        // 用來儲存最後一行的Array
        int[] ans = new int[num + 1];

        for (int y = 0; y <= num; y++)
        {
            for (int i = 0; i < y + 1; i++)
            {
                ans[i] = table[y][i];
            }               
        }
        
        // 輸出答案完後 換行
        System.out.println("");
   	 	System.out.println(ans[position]);
    }
	
	 
	
}
