import java.util.Scanner;

public class ArtistAudition {

	public static void main(String[] args) {
		
		System.out.println("藝人選秀");
		System.out.println("請輸入人數.");
		
		Scanner scanner = new Scanner(System.in);
		int inputValue = scanner.nextInt();
		
		int[][] personData = new int[inputValue][6];
		double[][] resultData = new double[inputValue][2];
		
		System.out.println("請輸入分數.");
		for(int i = 0; i < inputValue; i++) {
			// order
			personData[i][0] =scanner.nextInt();
			// face 
			personData[i][1] =scanner.nextInt();
			// singing 
			personData[i][2] =scanner.nextInt();
			// talk 
			personData[i][3] =scanner.nextInt();
			// acting 
			personData[i][4] =scanner.nextInt();
			
			// order
			resultData[i][0] = personData[i][0];
			// score
			resultData[i][1] = (personData[i][1] * 0.3) + (personData[i][2] * 0.3) + 
					(personData[i][3] * 0.2) + (personData[i][4] * 0.2);
		}
		
		for(int i = 0; i <= inputValue; i++) {
			for(int j = 0; j < inputValue - 1; j++) {
				
				if(resultData[j][1] < resultData[j + 1][1]) {
					
					double tempOrder = resultData[j + 1][0];
					double tempScore = resultData[j + 1][1];
					
					resultData[j + 1][0] = resultData[j][0];
					resultData[j + 1][1] = resultData[j][1];
					
					resultData[j][0] = tempOrder;
					resultData[j][1] = tempScore;
				}
				
			}
		}
		
		
		for(int i = 0; i <= inputValue; i++) {
			for(int j = 0; j < inputValue - 1; j++) {
				
				if(resultData[j][1] == resultData[j + 1][1]) {
					
					if(resultData[j][0] > resultData[j + 1][0]) {
						
						double tempOrder = resultData[j][0];
						double tempScore = resultData[j][1];
						
						resultData[j][0] = resultData[j + 1][0];
						resultData[j][1] = resultData[j + 1][1];
						
						resultData[j + 1][0] = tempOrder;
						resultData[j + 1][0] = tempScore;;
						
					}					
					
				}
				
			}
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.print(Math.round(resultData[i][0]) + ">");			
		}
		
	}
	
}
