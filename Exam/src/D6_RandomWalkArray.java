import java.util.Scanner;

public class D6_RandomWalkArray {

	public static void main(String[] args) {
		
		System.out.println("D6. 隨機漫步陣列");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("請輸入二維 N * M 陣列大小 (奇數) : ");
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
        boolean[] a = new boolean[100000000];
        int count = 1;//已走過數目
        int m1 = 0;
        int[] mcount =new int[10000000] ;//移動紀錄
        mcount[0] = m * n / 2 + 1;
        a[m * n / 2 + 1] = true;
        int[] mcount2 = new int[10000000];//紀錄順序
        mcount2[0] = m * n / 2 + 1;
        int p = m*n/2+1;//座標
        while (count < m * n) {
            int[] nextstep = new int[9];
            
            //八位預測
            int q = 0;
            if (p > m && (p - 1) % m != 0) {
                nextstep[q]= p - n - 1;
                q++;
            }
            
            if (p> m) {
                nextstep[q] = p - m ;
                q++;
            }
            
            if (p > m&& p % m != 0) {
                nextstep[q] = p - m + 1;
                q++;
            }
            
            if ((p - 1)%m != 0) {
                nextstep[q] = p  - 1;
                q++;
            }
            
            if (p %m !=0) {
                nextstep[q] = p  + 1;
                q++;

            }
            
            if (p < m * n - m&& (p - 1) % m != 0) {
                nextstep[q] = p + m- 1;
                q++;
            }
            
            if (p  < m * n-m) {
                nextstep[q] = p +m ;
                q++;
            }
            
            if (p < m * n - m && p % m != 0) {
                nextstep[q] = p + m + 1;
                q++;
            }
            
            m1++;
            
            int next = 0;

            next = (int)(Math.random()*q);
            p = nextstep[next];
            
            if (a[p] != true) {
                a[p] = true;
                mcount2[count] = p;
                count++;
            }
            
            mcount[m1] = p;
        }

        System.out.print("需移動");
        System.out.print(m1);
        System.out.print("次 (");
        
        for (int i = 0; i < m1; i++) {
        	System.out.print(mcount[i] + "-");
        }
        
        System.out.println(mcount[m1] + ")");
        
        for (int i = 0; i < n*m; i++) {
        	
        	System.out.print(mcount2[i] + " ");
        }   
		
		
	}

}
