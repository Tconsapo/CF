import java.util.Scanner;

public class Main {
    private static final char[] vowels = {'a','o','y','e','u','i'};
    
    private static boolean isVowel(char x){
        for (int i = 0; i < 6; i++)
            if (x == vowels[i]) return true;
        return false;
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        String s = in.nextLine();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++){
            if(!isVowel(s.charAt(i))){
                System.out.print("." + s.charAt(i));
            }
        }
    }
}
