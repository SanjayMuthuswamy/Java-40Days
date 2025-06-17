package Day8;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {

        System.out.println("=== 1. RAW ArrayList (Mixed Types) ===");
        ArrayList al = new ArrayList();  // Raw type (not recommended, but allowed)
        al.add("Sanjay");
        al.add(3);
        al.add(true);
        al.add(1, "someone");
        al.add(new Date());

        System.out.println("Raw ArrayList: " + al);  // Output: [Sanjay, someone, 3, true, current_date]

        System.out.println("\n=== 2. Array Print ===");
        int[] arr = {10, 20, 40};
        System.out.print("Array: ");
        for (int i : arr) System.out.print(i + " ");
        System.out.println();

        System.out.println("\n=== 3. Type-Specific ArrayList (String) ===");
        ArrayList<String> names = new ArrayList<>();
        names.add("BIT");
        names.add("CSE");
        names.add("ECE");
        System.out.println("Names: " + names);
        System.out.println("Contains 'BIT'? " + names.contains("BIT")); // true

        System.out.println("\n=== 4. Type-Specific ArrayList (Integer) ===");
        List<Integer> marks = new ArrayList<>();
        marks.add(10);
        marks.add(30);
        marks.add(20);

        System.out.println("Marks: " + marks);
        System.out.println("Access index 1: " + marks.get(1)); // 30
        System.out.println("Contains 10? " + marks.contains(10));
        System.out.println("Contains 50? " + marks.contains(50));

        System.out.println("\n=== 5. All Major ArrayList Operations ===");

        // ADD
        marks.add(40);                      // add at end
        marks.add(1, 25);                   // insert at index
        System.out.println("After adding: " + marks);

        // REMOVE
        marks.remove(2);                    // remove by index
        marks.remove(Integer.valueOf(40));  // remove by value
        System.out.println("After removing: " + marks);

        // SET
        marks.set(0, 100);                  // update index 0
        System.out.println("After updating index 0 to 100: " + marks);

        // GET
        int val = marks.get(1);
        System.out.println("Value at index 1: " + val);

        // SIZE
        System.out.println("Size of marks list: " + marks.size());

        // CLEAR
        System.out.println("Clearing marks list...");
        marks.clear();
        System.out.println("Marks after clear: " + marks);

        // IS EMPTY
        System.out.println("Is marks list empty? " + marks.isEmpty());

        System.out.println("\n=== 6. Looping Over List ===");
        names.add("EEE");
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Index " + i + ": " + names.get(i));
        }

        System.out.println("\nUsing foreach loop:");
        for (String s : names) {
            System.out.println("Name: " + s);
        }
    }
}
