import java.util.Scanner;

public class numberofdigits {
     public static void main(String[] args) {
        Scanner s =  new Scanner(System.in ); 
        int num =  s.nextInt() ; 

        System.out.println(numberofdigit(num));
    }

    public static int numberofdigit(int n){
        if (n <= 0 ){
            return 0 ; 
        }
        return 1 + numberofdigit(n/10) ; 
    }
}
