package RECURSION;

import java.util.Scanner;

public class power {
       public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println(Power(a,  b));
    }

    public static int Power(int a ,  int b){
        if (b==0 ){
            return 1 ;
        }
        else {
            return a*Power(a,b-1); 
        }
    }
}

