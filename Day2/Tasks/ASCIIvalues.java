package Day2.Tasks;

public class ASCIIvalues {
    public static void main(String[] args) {
        // Print ASCII values of uppercase letters A-Z
        for (int i=0 ; i<=255 ; i++) {
            char ch = (char) i; // Convert integer to character
            System.out.println("ASCII value of " + ch + " is: " + i);
        } 
    }
}
