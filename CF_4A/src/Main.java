import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        byte x;
        Scanner in = new Scanner(System.in);
        x = in.nextByte();
        if (x%2 == 0 && x!=2) System.out.println("YES");
        else System.out.println("NO");
    }
    
}
