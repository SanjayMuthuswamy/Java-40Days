import java.util.*;

public class sorted {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in) ; 

        // String str = s.nextLine() ; 
        int size = s.nextInt() ;
        int[] a =  new int[size] ; 
        for (int i=0 ; i<size ;  i++){
            a[i]  = s.nextInt() ; 
        }

        if (fn_name(a , a.length-1)){
                System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }
    }

    public static boolean fn_name(int[] a , int size) {
        if (size==0 ){  
            return true ; 
        }
        if (a[size] < a[size-1]){
            return false ; 
        }
        return fn_name(a, size-1) ; 
    }
}
