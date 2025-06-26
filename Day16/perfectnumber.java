import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        Scanner s=  new Scanner (System.in);  
         
        int num = s.nextInt();

        System.out.println((perfectnum(num))?true:false );
    }
    public static boolean  perfectnum(int n){
        int sum=0 ; 
        for(int i=1 ; i<n ; i++){
            if(n%i == 0){
                sum +=i ;
            }
        }
        return n==sum ;
    }
}
