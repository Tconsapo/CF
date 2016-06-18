import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        byte n = in.nextByte();
        byte k = in.nextByte();
        byte q, x;
        //byte[] q = new byte[n];
        for (byte i = 1; i < k; i++){
           q = in.nextByte();
           if (q == 0){
               System.out.println(i-1);
               System.exit(0);
           }
        }
        q = in.nextByte();
        if (q == 0) {
            System.out.println(k-1);
            System.exit(0);
        }
        for (byte i = 1; i <= n-k; i++){
            x = in.nextByte();
            if (x < q || x == 0){
                System.out.println(k+i-1);
                System.exit(0);
            }
        }
        
        if (q!=0) System.out.println(n);
        else  if(n!=k) System.out.println(0);
        else  System.out.println(n-1);
    }
    
}
