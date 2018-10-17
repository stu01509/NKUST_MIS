
public class Sales {

	public static void main(String[] args) {
		
		int[][] sales = new int[][] {{32, 35, 26, 30, 0}
									,{34, 30, 33,31, 0}
									,{0, 0, 0, 0, 0}};

		//計算業務員 一年的銷售量		
		for(int i = 0; i < sales.length; i++){
			
			for(int j = 0; j < sales[i].length - 1; j++){
				sales[i][sales[i].length-1] += sales[i][j];
			}
			
			System.out.println("");		
		}
		
		//計算每一季的銷售量
		for(int j = 0; j < sales[0].length ; j++){
		
			sales[2][j] = sales[0][j] + sales[1][j];
			
		}

		// 將陣列結果印出
		for(int i = 0; i < sales.length; i++){
			
			if(i > 1){
				System.out.print("業績合計為:  ");
				
			}else{
				
				System.out.print("業務員" + (i +1) + "的業績為: ");
			}
	
			for(int j = 0; j < sales[i].length; j++){
				System.out.print(sales[i][j]+ " ");
			}
			
			System.out.println("");
		
		}

	}
	
}
