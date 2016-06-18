import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        byte m = in.nextByte();
        byte n = in.nextByte();
        if (m == 1 && n == 1){
            System.out.println(0);
            System.exit(0);
        }
        System.out.println(m*n/2);
    }
    
}
