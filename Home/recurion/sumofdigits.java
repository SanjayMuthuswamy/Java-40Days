import java.util.* ; 

public class sumofdigits {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in ); 
        int num =  s.nextInt() ; 

        System.out.println(sumofdigit(num));
    }

    public static int sumofdigit(int n){
        if (n == 0 ){
            return 0 ; 
        }
        else{
            return (n%10) +  sumofdigit(n/10) ;
            // return n ;   
        }
    }
}

