package twopinter;
import java.util.* ; 

public class targetsum {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in) ; 
        int a[] =  new int[10] ; 
        
        int targetsum = s.nextInt() ; 
        for (int i=0 ; i<10 ; i++){
            a[i] = s.nextInt() ; 
        }
        
        int left =0 ; 
        int  right = 9; 

        while (left <  right){
            int looptarget = a[left]+a[right] ;
            if (looptarget == targetsum){
                System.out.printf("%d %d " , a[left] ,  a[right]) ; 
                return ; 
            }
            else if (looptarget > targetsum){
                right -- ;  
            }
            else {
                left ++  ;
            }
        }
        System.out.println("Not found");

    }
}
