
public class D5_Poker {
	
	public static void main(String[] args) {
		
		int[] pokers = new int[54];
		
		String[][] randomPokers = new String[54][2];
		
		String[] nPlayer = new String[14];
		String[] sPlayer = new String[14];
		String[] wPlayer = new String[14];
		String[] ePlayer = new String[14];
				
		int step = 1;
		for (int i = 1; i <= 53; i++) {

			if(i == 14 || i == 27 || i == 40 || i == 53){
				step = 1;
			}
			pokers[i] = step;
			step++;
		}
		
		for (int i = 1; i <= 53; i++) {

			int randomIndex = ((int)Math.round(Math.random() * 52)) + 1;

			int temp = pokers[i];
			  pokers[i] = pokers[randomIndex];
			  pokers[randomIndex] = temp;
		}
		
		
		for (int i = 1; i < pokers.length; i++) {
			System.out.print(pokers[i] + " ");
		}
		System.out.println("");

		String[] types = {"♠", "♥", "♦", "♣"};
		
		
		for (int i = 1; i <= 53; i++) {
			
			  String type = "";
			  
			  if (pokers[i] % 4 == 0) {
			    type = types[0];
			  } else if (pokers[i] % 4 == 1) {
			    type = types[1];
			  } else if (pokers[i] % 4 == 2) {
			    type = types[2];
			  } else if (pokers[i] % 4 == 3) {
			    type = types[3];
			  } 
			  
			  randomPokers[i][0] = type;
			  randomPokers[i][1] = String.valueOf(pokers[i]);
//			  if (pokers[i] <= 13) {
//				  randomPokers[i][1] = String.valueOf(pokers[i]);
//			  }else {
//				  randomPokers[i][1] = String.valueOf((int)(pokers[i] / 4));  
//			  }
			  
			  
		}
				
		int nIndex = 1;
		int sIndex = 1;
		int wIndex = 1;
		int eIndex = 1;
		
		for (int i = 1; i <= randomPokers.length - 2; i++) {
			
			if (i % 4 == 0) {
				nPlayer[nIndex] = randomPokers[i][0] + "" + randomPokers[i][1];
				nIndex++;
				
			} else if (i % 4 == 1) {
				sPlayer[sIndex] = randomPokers[i][0] + "" + randomPokers[i][1];
				sIndex++;
				
			} else if (i % 4 == 2) {
				wPlayer[wIndex] = randomPokers[i][0] + "" + randomPokers[i][1];
				wIndex++;
				
			} else if (i % 4 == 3) {
				ePlayer[eIndex] = randomPokers[i][0] + "" + randomPokers[i][1];
				eIndex++;
				
			}
			
		}
		
		System.out.print("東家：");
		for (int i = 1; i <= ePlayer.length - 1; i++) {
			System.out.print(ePlayer[i] + " ");
		}
		
		System.out.println("");
		System.out.print("西家：");
		for (int i = 1; i <= wPlayer.length - 1; i++) {
			System.out.print(wPlayer[i] + " ");
		}
		
		System.out.println("");
		System.out.print("南家：");
		for (int i = 1; i <= sPlayer.length - 1; i++) {
			System.out.print(sPlayer[i] + " ");
		}
		
		System.out.println("");
		System.out.print("北家：");
		for (int i = 1; i <= nPlayer.length - 1; i++) {
			System.out.print(nPlayer[i] + " ");
		}
		
	}			

}
