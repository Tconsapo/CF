import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        byte n = in.nextByte();
        in.nextLine();
        for (byte i = 1; i <= n; i++){
            String s = in.nextLine();
            if (s.length() < 11) System.out.println(s);
            else System.out.println(s.charAt(0) + Integer.toString(s.length()-2) + s.charAt(s.length()-1));
        }
    }
    
}
