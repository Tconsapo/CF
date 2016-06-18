import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int ones = 0;
        int zeros = 0;
        String s = in.nextLine();
        char hp = s.charAt(0);
        for(int i = 1; i<s.length(); i++){
            char h = s.charAt(i);
            if (h == '0'){
                ones = 0;
                if (hp == '0') 
                    zeros++;
            }
            if (h == '1'){
                zeros = 0;
                if (hp == '1') 
                    ones++;
            }
            if (zeros == 6 || ones == 6) {
                System.out.println("YES");
                return;
            }
            hp = h;
        }
        System.out.println("NO");
    }
    
}
