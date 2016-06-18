import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = 0;
        int g = 0;
        for (int i = 0; i < n; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            g += b - a;
            if (g > max) max = g;
        }
        System.out.println(max);
    }
    
}
