package Day3.Tasks;
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in) ;
        int number  =  scan.nextInt() ; 
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
        scan.close() ;
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        int   result =  1 ;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
