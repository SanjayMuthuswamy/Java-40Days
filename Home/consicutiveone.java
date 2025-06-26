import java.util.*;

public class consicutiveone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[] = new int[size];

        for (int i=0  ; i<size ;  i++){
            arr[i] =  scan.nextInt() ; 
        }

        int consone = 0;
        int countone = 0;
        for (int i = 0; i < size; i++) {

            if(arr[i] != 1 ){
                consone = Math.max(consone , countone) ;
                countone = 0 ; 
                continue ; 
            }
            countone++ ;
        }
        consone = Math.max(consone , countone) ;    
        System.out.println(consone);
    }
}
