import java.util.Scanner;

public class intstr {
   public static void main(String[] args) {
        Scanner s =  new Scanner(System.in) ; 

        // String str = s.nextLine() ; 
        int a = s.nextInt() ;

        System.out.println(sumofseries(a));

    }   

    public static float sumofseries(int n ){
        if (n == 1 ){
            return 1 ;  
        }
        return 1.0f/n+(sumofseries(n-1)) ;
    
    } 
}
//1+1/2+1/3 .... +1/n