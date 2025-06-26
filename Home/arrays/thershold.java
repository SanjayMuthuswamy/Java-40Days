package arrays;

import java.util.* ; 


public class thershold {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);

        int size =  s.nextInt() ; 
        int[] arr = new int[size] ; 
        int thersholdnum = s.nextInt() ;

        for(int i=0 ; i<size  ; i++){
            arr[i] = s.nextInt() ; 
        }

        int count =0 ; 
        int diff =0 ;
        for (int i : arr) {
            int q = i/thersholdnum ; 
            diff = Math.abs(i-(q*thersholdnum)); 
            if((diff < thersholdnum)  && (i%thersholdnum!=0)){
                count = (q+1)+count ;
            } 
            else{
                count += q ; 
            }
        }
        System.out.println(count);


    }
}
