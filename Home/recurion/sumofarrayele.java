import java.util.Scanner;

public class sumofarrayele {
      public static void main(String[] args) {
        Scanner s =  new Scanner(System.in ); 
        int[] arr= {2,2,2,2,1,1,1,1,1} ;
        System.out.println(sumofarrayelements(arr, 0)); 
    }

    public static int sumofarrayelements(int[] n ,int idx){
        if (idx > 8 ){
            return 0 ; 
        }
        else{
            return  n[idx] + sumofarrayelements(n, idx+1) ; 
        }
    }
}
