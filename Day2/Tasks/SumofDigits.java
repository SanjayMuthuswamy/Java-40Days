package Day2.Tasks;

public class SumofDigits {
    public static void main(String[] args) {
        int number = 12345; // Example number to sum its digits
        int sum = 0; // Variable to store the sum of digits

        // Loop to calculate the sum of digits
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            sum += digit; // Add the digit to the sum
            number /= 10; // Remove the last digit from the original number
        }
        System.out.println("Sum of digits: " + sum); // Output the result
    }
}
