import java.util.Scanner;

public class notozero {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in) ; 
        int a = s.nextInt() ;

        System.out.println(count(a));
    }

    public static int count(int a){    
        if (a==0){
            return  0 ; 
        }
        if (a%2 ==0 ){
            return 1+count(a/2) ; 
        }  
        else{
            return 1+count(a-1) ;
        }     
    }
}
//even / 2 
// odd  - 1 
