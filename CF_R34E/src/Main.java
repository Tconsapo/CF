import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if (s.charAt(0) != '-') s = "+ " + s;
        String res = "";
        String[] str = s.split(" ");
        int n = Integer.valueOf(str[str.length-1]);
        int plus = 0;
        int minus = 0;
        for (int i = 0; i < str.length; i++){
            String p = str[i];
            switch (p){
                case ("+"):
                    plus++;
                    break;
                case ("-"):
                    minus++;
                    break;
            }
        }
        if (plus > minus && plus-minus > n/plus){
            System.out.println("Impossible");
            System.exit(0);
        }
//        if (minus > plus && minus-plus < (n/plus)){
//            System.out.println("Impossible");
//            System.exit(0);
//        }
        if (plus == 0) {
            System.out.println("Impossible");
            System.exit(0);
        }
        if (plus == 0 && minus == 0)
        {
            System.out.println("Possible");
            System.out.println(n + " = " + n);
            System.exit(0);
        }
        
        ArrayList<Integer> v = new ArrayList<>();
        String ans = "";
        int _n = n;
        int r = abs(plus - minus);
        if (r == 0){
            if (plus == 1)
            {
                System.out.println("Impossible");
                System.exit(0);
            }
            v.add(n);
            v.add(2);
            int it = 0;
            for (int i = 0; i < s.length(); i++){
                switch (s.charAt(i)){
                   case '-':
                       ans += ("- " + 1 + " ");
                       i += 3;
                   break;
                   case '+':
                       if (it < 2){
                           ans += ("+ " + v.get(it) + " ");
                           i += 3;
                           it++;
                       }
                       else{
                           ans += ("+ " + 1 + " ");
                           i += 3;
                       }
                   break;
                }
            }
            StringBuffer sb = new StringBuffer();
            sb.append(ans);
            if (ans.charAt(0) == '+'){
                sb.delete(0, 2);
            }
            System.out.println("Possible");
            System.out.println(sb.toString() + " = " + Integer.toString(n));
            System.exit(0);
        }
        int q = _n/r;
        for (int i = 0; i < r-1; i++) v.add(q);
        v.add(q + n%r);
        int it = 0;
        if (plus > minus){
            for (int i = 0; i < s.length(); i++){
                switch (s.charAt(i)){
                    case '-':
                        ans += ("- " + 1 + " ");
                        i += 3;
                    break;
                    case '+':
                        if (it < r){
                            ans += ("+ " + v.get(it) + " ");
                            it++;
                            i += 3;
                        }
                        else
                        {
                            ans += ("+ " + 1 + " ");
                            i += 3;
                        }
                    break;
                }  
            }
        }
        else{
            int d = minus/(plus-1);
            int _d = minus%(plus-1);
            ArrayList<Integer> _v = new ArrayList<>();
            for (int i = 0; i < r-1; i++) _v.add(d);
            _v.add(d + _d);
            int _it = 0;
            for (int i = 0; i < s.length(); i++){
                switch (s.charAt(i)){
                    case '-':
                        ans += ("- " + 1 + " ");
                        i += 3;
                    break;
                    case '+':
                        if (it < r){
                            ans += ("+ " + v.get(it) + " ");
                            it++;
                            i += 3;
                        }
                        else
                        {
                            ans += ("+ " + _v.get(_it) + " ");
                            i += 3;
                        }
                    break;
                }  
            }
        }
        StringBuffer sb = new StringBuffer();
        sb.append(ans);
        if (ans.charAt(0) == '+'){
            sb.delete(0, 2);
        }
        System.out.println("Possible");
        System.out.println(sb.toString() + " = " + Integer.toString(n));
    }
}
