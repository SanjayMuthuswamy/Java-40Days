package Day2.Tasks;

import java.util.Scanner; 
public class PositiveNegativeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number (or type '69' to quit): "); // Prompt user for input
        int posnumber = 0; // Counter for positive numbers
        int negnumber = 0; // Counter for negative numbers
        int zero = 0; // Counter for zeros

        Scanner scan = new Scanner(System.in); 
        while (true) { 
            int number =  scan.nextInt() ;  
            if (number > 0  && number != 69) {
                posnumber = posnumber+1 ; 
                System.out.println("The number is positive.");
            } else if (number < 0) {
                negnumber = negnumber+1 ;
                System.out.println("The number is negative.");
            } else if(number == 0) {
                zero = zero+1 ; 
                System.out.println("The number is zero.");
            }
            else {
                System.out.println("Exiting the program."); // Exit message
                break; // Exit the loop if the input is not a valid number
            }
        }
        // Print the counts of positive, negative, and zero numbers
        System.out.println("Total positive numbers: " + posnumber);
        System.out.println("Total negative numbers: " + negnumber);
        System.out.println("Total zeros: " + zero);
        scan.close();
    }
    
}
