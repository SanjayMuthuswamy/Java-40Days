package Day2.Tasks;

public class  Alphabet{
    public static void main(String[] args) {
        // Print the English alphabet in uppercase
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            System.out.print(letter + " ");
        }
        System.out.println(); // New line after printing the alphabet

        // Print the English alphabet in lowercase
        for (char letter = 'a'; letter <= 'z'; letter++) {
            System.out.print(letter + " ");
        }
        System.out.println(); // New line after printing the alphabet
    }
}
