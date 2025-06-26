import java.util.*;

public class tailorseries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt(); 
        int n = s.nextInt(); 

        // double res = 1.0;

        // for (int i = 1; i <= n; i++) {
        //     double val = Math.pow(x, i) / fact(i);
        //     res += val;              
        // }

        System.out.printf("%.5f", Tailor(x,n));
    }
    public static double Tailor(int x ,int n ) {
        if (n==0) return 1;
        return (Math.pow(x, n) / fact(n))  + Tailor(x, n-1);
    }
 
    public static double fact(int a) {
        if (a == 0 || a == 1) return 1;
        return a * fact(a - 1);
    }

}
