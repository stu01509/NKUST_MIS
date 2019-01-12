
public class D5_Poker {
	
	public static void main(String[] args) {
		
		System.out.println("D5. 撲克牌發牌");
		String[] pokers = new String[52];
	
		String[] nPlayer = new String[14];
		String[] sPlayer = new String[14];
		String[] wPlayer = new String[14];
		String[] ePlayer = new String[14];
		
		String[] types = {"♠", "♥", "♦", "♣"};
		String type = types[0];
		int step = 1;
		
		for (int i = 0; i < pokers.length; i++) {

			if(i == 13 || i == 26 || i == 39){
				step = 1;
			}
			
			if (i == 13) {
				type = types[1];
			}else if (i == 26) {
				type = types[2];
			} else if (i == 39) {
				type = types[3];
			}
			
			pokers[i] = type + step;
			step++;
		}
		
		for (int i = 0; i < pokers.length; i++) {

			int randomIndex = ((int)Math.round(Math.random() * 51));
			String temp = pokers[i];
			  pokers[i] = pokers[randomIndex];
			  pokers[randomIndex] = temp;
		}		
						
		int nIndex = 1;
		int sIndex = 1;
		int wIndex = 1;
		int eIndex = 1;
		
		for (int i = 0; i < pokers.length; i++) {
			
			if (i % 4 == 0) {
				nPlayer[nIndex] = pokers[i];
				nIndex++;
				
			} else if (i % 4 == 1) {
				sPlayer[sIndex] = pokers[i];
				sIndex++;
				
			} else if (i % 4 == 2) {
				wPlayer[wIndex] = pokers[i];
				wIndex++;
				
			} else if (i % 4 == 3) {
				ePlayer[eIndex] = pokers[i];
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
