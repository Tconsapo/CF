import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] s1 = s.toCharArray();
        s1[0] = Character.toUpperCase(s1[0]);
        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        System.out.println(sb.toString());
    }
    
}
