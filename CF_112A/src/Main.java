import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (s1.compareTo(s2) > 0)
            System.out.println(1);
        if (s1.compareTo(s2) == 0)
            System.out.println(0);
        if (s1.compareTo(s2) < 0)
            System.out.println(-1);
    }
    
}
