package RECURSION;
public class Main {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);

        int  num = s.nextInt() ; 
        System.out.println(factorial( num));
    }

    public static int factorial(int n){
        if (n==0){
            return 0 ;
        }
        else {
            return n*factorial(n-1) ; 
        }
    }
}