import java.util.Scanner;
import java.math.*;

public class Main {
    
    private static BigInteger getNOD(BigInteger a, BigInteger b){
        while (!b.mod(a).toString().equals("0")){
            b = b.mod(a);
            BigInteger c = a;
            a = b;
            b = c;
        }
        return a;
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        BigInteger a = in.nextBigInteger();
        BigInteger b = in.nextBigInteger();
        if (a.equals(b)){
            System.out.println(a);
            System.exit(0);
        }
        BigInteger n = BigInteger.ONE;
        BigInteger i = a.add(BigInteger.ONE);
        while (!i.equals(b)){
            n = getNOD(n,i);
            if (n.equals(BigInteger.ONE)){
                System.out.println(1);
                System.exit(0);
            }
            i = i.add(BigInteger.ONE);
        }
        n = getNOD(n,b);
        System.out.println(n);
    }
}
