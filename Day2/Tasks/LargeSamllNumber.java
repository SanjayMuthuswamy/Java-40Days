package Day2.Tasks;
import java.util.Scanner;

public class LargeSamllNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        int largest = Integer.MIN_VALUE; // Initialize largest to the smallest possible integer
        int smallest = Integer.MAX_VALUE; // Initialize smallest to the largest possible integer
        while (true){
            System.out.print("Enter a number (or type '2' to quit): "); // Prompt
            int input = scanner.nextInt(); // Read user input
            if (input == 2) { // Check if the input is 2 to exit the loop
                System.out.println("Exiting the program.");
                break; // Exit the loop
            }
            if (input > largest) { // Check if the input is larger than the current largest
                largest = input; // Update largest
            }

            if (input < smallest) { // Check if the input is smaller than the current smallest
                smallest = input; // Update smallest
            }
            System.out.println("Current largest number: " + largest); // Print the current largest number
            System.out.println("Current smallest number: " + smallest); // Print the current smallest number
            
        }
        //find the largest and smallest digits in the number after the user input 
        System.out.println("Final largest number: " + largest); // Print the final largest number
        System.out.println("Final smallest number: " + smallest); // Print the final smallest number
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
