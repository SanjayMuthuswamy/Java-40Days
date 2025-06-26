package twopinter;

import java.util.*;

public class zeroswap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        int left = 0;
        int right = 0;

        while (right < size) {
            if (arr[right] != 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
            }
            right++;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}

// package twopinter;
// import java.util.* ;

// public class zeroswap {
// public static void main(String[] args) {
// Scanner s = new Scanner(System.in);

// int size = s.nextInt() ;
// int[] arr = new int[size] ;

// for(int i=0 ; i<size ; i++){
// arr[i] = s.nextInt() ;
// }

// int left = 0 ;
// int right = size-1 ;
// while (left < right ){
// if (arr[left] == 0){
// // int temp = arr[left] ;
// arr[left] = arr[right] ;
// arr[right] = 0 ;

// right--;
// }
// else{
// left++ ;
// }
// }
// // System.out.println(arr.toString()) ;
// // System.out.println(new String(arr));
// for (int num : arr) {
// System.out.print(num + " ");
// }
// }
// }
