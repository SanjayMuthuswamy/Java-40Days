package RECURSION;

import java.util.Scanner;

public class count {
      public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();

        System.out.println(digitCount( num ));
    }
    public static  int digitCount(int n){
        if (n == 0 ){
            return  0 ; 
        }
        else{
            return 1 + digitCount(n/10)  ; 
        }
    }
}
