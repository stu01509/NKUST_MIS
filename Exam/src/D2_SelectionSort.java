
public class D2_SelectionSort {

	public static void main(String[] args)  {
	
		System.out.println("D2. 選擇排序法");
		
		int[] arr = {23, 54, 6, 87, 30, 47, 13, 17, 91, 72};
		
		for (int i = 0; i < arr.length - 1; i++) {
            // find minimun in i ~ arr.length - 1
            int min = i;
            
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            
            // swap data[i] with arr[min]
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;

        }
		
		System.out.print("排序結果為 ");
		
		for(int i:arr) {
			System.out.print(i + " ");
		}
            
		
	}   
	
}

