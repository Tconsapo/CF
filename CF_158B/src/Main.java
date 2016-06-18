import java.util.Scanner;

public class Main {
    
    
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = 0;
        int[] v = {0,0,0,0};
        for (int i = 0; i < n; i++){
            int p = in.nextInt();
            v[p-1]++;
        }
        q += v[3];
        v[3] = 0;
        
        if (v[0] > v[2]) {
            q += v[2];
            v[0] -= v[2];
            v[2] = 0;
        }
        else{
            q += v[0];
            v[2] -= v[0];
            v[0] = 0;
        }
        q += v[2];
        v[2] = 0;
        
        q += v[1]/2;
        v[1] = v[1]%2;
        if (v[1] == 1 && v[0] > 1){
          q++;
          v[1] = 0;
          v[0] -= 2;
        }
        if (v[1] == 1 && v[0] == 1){
            q++;
            v[1]--;
            v[0]--;
        }
        
        q += v[0]/4;
        if (v[0]%4 > 0) q++;
        v[0] = 0;
        
        q+=v[1];
        
        System.out.println(q);
    }
}
