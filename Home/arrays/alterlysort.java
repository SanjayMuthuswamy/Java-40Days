package arrays;
import java.util.* ; 

public class alterlysort {
    public static void main(String[] args) {
        int[] arr = {2,1,3,9,4,5,7,8,6} ; // 1 ,2 ,3 , 4 ,5 ,6 , 7 , 8 , 9 
        Arrays.sort(arr) ; 

        System.out.println("Sorted : "+Arrays.toString(arr)+"\n" + "Array len : " + arr.length);

        int[] alter_sort = new int[9] ;
        int right = arr.length-1 ;
        int left = 0 ;
        for(int i=0  ; i<arr.length ;i++){
            if (i%2==0){
                alter_sort[i] = arr[right--] ; 
            }
            else{
                alter_sort[i] = arr[left++]; 
            }
        }
        System.out.println( Arrays.toString(alter_sort));
    }
}
//Problem Statement:
// Given an unsorted array of integers, rearrange the elements in such a way that the first element is the largest, the second is the smallest, the third is the second-largest, the fourth is the second-smallest, and so on.

// This is known as alternate sorting (or max-min sorting).