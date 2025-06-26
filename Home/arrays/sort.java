package arrays;

import java.util.Arrays;

public class sort {
    public static void main(String[] args){
        int[]  a =  {1,2,3,4,5,1};
        int[] a2 = Arrays.copyOf (a , a.length-1) ;
        System.out.println(Arrays.toString(a2));
        Arrays.sort(a2) ; 

        if (Arrays.equals(a,a2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
// to find the given array is sorted 
