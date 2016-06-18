import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        long n,m,a;
        Scanner in = new Scanner(System.in);
        n = in.nextLong();
        m = in.nextLong();
        a = in.nextLong();
        long x,_x,y,_y;
        x = n/a;
        y = m/a;
        _x = (n%a);
        _y = (m%a);
        if (_x!=0) x++;
        if (_y!=0) y++;
        System.out.println(x*y);
    }
    
}
