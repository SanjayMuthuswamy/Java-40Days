package Day2.Concepts ; 
public class Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b)); // Output: 15
        System.out.println("Subtraction: " + (a - b)); // Output: 5
        System.out.println("Multiplication: " + (a * b)); // Output: 50
        System.out.println("Division: " + (a / b)); // Output: 2
        System.out.println("Modulus: " + (a % b)); // Output: 0

        // Relational Operators
        System.out.println("Is a > b? " + (a > b)); // Output: true
        System.out.println("Is a < b? " + (a < b)); // Output: false
        System.out.println("Is a == b? " + (a == b)); // Output: false

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y)); // Output: false
        System.out.println("x || y: " + (x || y)); // Output: true
        System.out.println("!x: " + (!x)); // Output: false

        // Assignment Operators
        int c = 20;
        c += 5; // Equivalent to c = c + 5;
        System.out.println("c after += 5: " + c); // Output: 25

        // Bitwise Operators
        int d = 6, e = 3; // Binary: d=110, e=011
        System.out.println("d & e: " + (d & e)); // Output: 2 (Binary AND)
        System.out.println("d | e: " + (d | e)); // Output: 7 (Binary OR)
        System.out.println("d ^ e: " + (d ^ e)); // Output: 5 (Binary XOR)
    }
}