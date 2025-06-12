package Day2.Tasks;

//compute the avg 
// of three numbers and check if the avg is greater than all three numbers
// if a is greater than b and c then increment a by 1 else decrement a by 1
// find the minimum of a, b, c using ternary operator
// print the avg, is_avg_greater, updated value of a, and minimum value among a, b, c

public class Operators1 {
    public static void main(String[]  args){
        int a  = 90 ; 
        int b  = 10 ;
        int c =  10 ;

        float avg = (a+b+c)/3 ; 
        boolean is_avaggreater = avg > a && avg > b && avg > c ;
        if (a > b && a >c){
            a++ ;
        }
        else{
            a-- ;
        }

        int min = (a < b && a < c) ? a : (b < c ? b : c);
        System.out.println("Average: " + avg);
        System.out.println("Is average greater than all numbers? " + is_avaggreater);   
        System.out.println("Updated value of a: " + a);
        System.out.println("Minimum value among a, b, c: " + min);
    }
}
