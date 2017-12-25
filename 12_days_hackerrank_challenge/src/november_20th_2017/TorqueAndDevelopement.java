package november_20th_2017;

import java.util.Scanner;

public class TorqueAndDevelopement {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            long x = in.nextLong();
            long y = in.nextLong();
            
            for(int a1 = 0; a1 < m; a1++) {
                int city_1 = in.nextInt();
                int city_2 = in.nextInt();
            }
            long sum = 0;
            if(x < y) {
                sum = x*n;
            }
            System.out.println(sum);
        }
    }
}
