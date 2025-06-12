package Day2.Tasks;
    // Count the number of digits in the number
    // This program demonstrates how to count the number of digits in an integer.

public class CountNumberofDigit {
    public static void main(String[] args) {
        int number = 123456789; 
        // int count = 0; // Initialize digit count

        // // Count the number of digits in the number
        // while (number != 0) {
        //     number /= 10; // Remove the last digit
        //     count++; // Increment the count
        // }
        // System.out.println("Number of digits: " + count); // Output the result

        String numberString = String.valueOf(number); 
        int count = numberString.length(); 
        System.out.println("Number of digits: " + count); 
    }
    
}
