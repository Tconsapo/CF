import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        short n = in.nextShort();
        short p = 0;
        in.nextLine();
        for (short i = 0; i < n; i++){
            String s = in.nextLine();
            switch (s){
                case ("X++"):
                    p++;
                    break;
                case ("++X"):
                    ++p;
                    break;
                case ("--X"):
                    --p;
                    break;
                case ("X--"):
                    p--;
                    break;
            }
        }
        System.out.println(p);
    }
    
}
