import java.util.Scanner;

public class inttobin {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in) ; 
        int a = s.nextInt() ;
        System.out.println(intbin( a ));
    }
    
    public static String intbin(int n ){
        if ( n == 0){
            return "0"; 
        }
        if(n == 1 ){
            return "1" ;
        }
        return intbin(n/2) + n%2; 
    }
}
