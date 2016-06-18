import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] money = new int[101];
        int sum = 0;
        for (int y : money) y = 0;
        int n = in.nextInt();
        for (int i = 0; i < n; i++){
            int p = in.nextInt();
            money[p]++;
            sum += p;
        }
        int s1 = 0;
        int p = 0;
        int i = 100;
        while (sum-s1>=s1){
            while (money[i] == 0) i--;
            s1 += i;
            p++;
            money[i]--;
        }
        System.out.println(p);
    }
    
}
