import java.util.Scanner;

public class Main {
    
    private static boolean isLucky(int x){
        char[] h = Integer.toString(x).toCharArray();
        for (int i = 0; i< h.length; i++){
            if (h[i] != '4' && h[i] != '7'){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        if (isLucky(p)){
            System.out.println("YES");
            return;
        }
        for (int i = 4; i < p; i++){
            if (isLucky(i))
                if (p%i == 0){
                    System.out.println("YES");
                    return;
                }
        }
        System.out.println("NO");
    }
    
}
