import java.util.Scanner;

public class amicablepair {
     public static void main(String[] args) {
        Scanner s=  new Scanner (System.in);  
         
        int num = s.nextInt();
        int num1 =s.nextInt() ;
        //220 , 284
        if((amicablenum(num1) == num) && (amicablenum(num) == num1) ){
            System.out.println(true);
            return ; 
        }   
        System.out.println(false);    

    }
     public static int  amicablenum(int n){
        int sum=0 ; 
        for(int i=1 ; i<n ; i++){
            if(n%i == 0){
                sum +=i ;
            }
        }
        return sum ;
    }
}
