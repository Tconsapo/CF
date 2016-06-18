import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] p = new int[3];
        String s = in.nextLine();
        for (int i = 0; i<s.length(); i += 2){
            switch (s.charAt(i)){
                case '1':
                    p[0]++;
                    break;
                case '2':
                    p[1]++;
                    break;
                case '3':
                    p[2]++;
                    break;
            }
        }
        s = "";
        for (int i = 0; i < p[0]; i++)
            s+="+1";
        for (int i = 0; i < p[1]; i++)
            s+="+2";
        for (int i = 0; i < p[2]; i++)
            s+="+3";
        StringBuffer ss = new StringBuffer();
        ss.append(s);
        ss = ss.replace(0, 1, "");
        System.out.println(ss);
    }
    
}
