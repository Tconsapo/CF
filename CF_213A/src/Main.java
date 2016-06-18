import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int p = 0;
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            int q = 0;
            for (int j = 0; j < 3; j++) q += in.nextInt();
            if (q > 1) p++;
        }
        System.out.println(p);
    }
    
}
