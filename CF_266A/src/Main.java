import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        char h = s.charAt(0);
        n = 0;
        for (int i = 1; i < s.length(); i++){
            if(s.charAt(i) == h) n++;
            h = s.charAt(i);
        }
        
        System.out.println(n);
    }
    
}
