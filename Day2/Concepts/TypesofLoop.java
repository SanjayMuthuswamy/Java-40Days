package Day2.Concepts;

public class TypesofLoop {
    public static void main(String[] args) {
        // For loop example

        System.out.println("For Loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration " + i);
        }

        // While loop example
        System.out.println("\nWhile Loop:");
        int j = 0;
        while (j < 5) {
            System.out.println("Iteration " + j);
            j++;
        }

        // Do-while loop example
        System.out.println("\nDo-While Loop:");
        int k = 0;
        do {
            System.out.println("Iteration " + k);
            k++;
        } while (k < 5);


        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("Enhanced For Loop: " + number);
        }
        // Enhanced for loop example  
    }
    
}
