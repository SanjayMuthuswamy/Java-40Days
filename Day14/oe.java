import java.util.Scanner;

public class oe {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in) ; 

        // String str = s.nextLine() ; 
        // int a = s.nextInt() ;

        // System.out.println();

        // int[]  a = {2,1918 ,397,1,2,34,56,7,9} ; 
        int[]  a = {2,17 ,397,1,2,4,56,7,9} ; 

        fn_name(a , a.length-1);
    }

    public static void fn_name(int[] arr , int n){
        if ( n<0 ){
            return  ; 
        }                                                                                                                         
        if (arr[n]%2==0){  bb                                                                                 
            System.out.print(arr[n]+" ");
        }

        fn_name(arr ,n-1);

            if (arr[n]%2!=0){
            System.out.print(arr[n] +" ");
        }
    }
}
   