package Day12;

import java.util.Scanner;

//palindorme 


public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        String s  =  scan.nextLine() ; 
        StringBuilder x = new StringBuilder(s) ; 

        if((x.reverse().toString()).equals(s)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindorme");
        }
    }
}
