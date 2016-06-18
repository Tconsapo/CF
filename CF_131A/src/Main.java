import java.util.Scanner;

public class Main {
    
    private static boolean isCaps(String s){
        for (int i = 1; i<s.length(); i++){
            String h = "";
            h += s.charAt(i);
            if (h != h.toUpperCase()){
                return false;
            }
        }
        return true;
    }
    
    private static String reverse(char h){
        String s = "";
        s+=h;
         if (s != s.toUpperCase())
             return s.toUpperCase();
         else
             return s.toLowerCase();
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        StringBuffer s = new StringBuffer();
        s.append(in.nextLine());
        if (isCaps(s.toString())){
            for (int i = 0; i<s.length(); i++)
                System.out.print(reverse(s.charAt(i)));
        }
        else
            System.out.println(s.toString());
    }
    
}
