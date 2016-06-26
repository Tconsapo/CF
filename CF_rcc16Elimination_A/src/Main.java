import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int t0 = in.nextInt();
        for (int i = 0; i < n; i++){
            int k = in.nextInt();
            int[] p = new int[k];
            for (int j = 0; j < k; j++){
                p[j] = in.nextInt();
            }
            int tt = 0, max = 0;
            int j = 0;
            while (tt < t && j < k){
               tt += p[j];
               if (p[j] > p[max]) max = j;
               if (tt > t) break;
               j++;
            }
            if (p[max] > t0) p[max]=t0;
            tt = 0;
            j = 0;
            while (tt < t && j < k){
                tt += p[j];
                if (tt > t) break;
                j++;
            }
            System.out.println(j);
        }
    }
    
}
