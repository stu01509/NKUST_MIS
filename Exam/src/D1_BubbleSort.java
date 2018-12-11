
public class D1_BubbleSort {

	public static void main(String[] args) {
		
		System.out.println("D1. ®ðªw±Æ§Çªk");
		
		long[] randomArr = new long[10];
		
		for (int i = 0; i < randomArr.length; i++) {
			
			randomArr[i] = Math.round((Math.random() * 499) + 1);
			
		}
		
		for (int i = 0; i < randomArr.length; i++) {
			
			for (int j = 0; j < randomArr.length - 1; j++) {
				
				if (randomArr[j] > randomArr[j + 1]) {
					
					long tempNum = randomArr[j];					
					randomArr[j] = randomArr[j + 1];				
					randomArr[j + 1] = tempNum;
				}
				
			}
			
		}
		
		for (long element : randomArr) {
		        System.out.print(element + " ");
		}
		
	}

}
