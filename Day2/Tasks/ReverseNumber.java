package Day2.Tasks;
import java.util.Scanner; // Import Scanner class for user input

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in) ; 
        int number  = scan.nextInt() ; 
        int reversedNumber = 0; 

        // Loop to reverse the number
        while (number != 0) {
            int digit = number % 10; 
            reversedNumber = reversedNumber * 10 + digit; 
            number /= 10; 
        }

        System.out.println("Reversed Number: " + reversedNumber); 
    }
}
