import java.util.Scanner;

public class monkey {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int m = s.nextInt();   // total monkeys
        int b = s.nextInt();   // banana per monkey
        int ep = s.nextInt();  // peanut per monkey
        int tb = s.nextInt();  // total bananas
        int tp = s.nextInt();  // total peanuts

        int fedByBananas = tb / b;
        System.out.println("__" +fedByBananas);
        int fedByPeanuts = tp / ep;
        System.out.println("__" +fedByPeanuts);

        int totalFed = fedByBananas + fedByPeanuts;
 
        System.out.println("Monkeys ate  food: " + (totalFed > 0 ? totalFed : 0));
    }
}
