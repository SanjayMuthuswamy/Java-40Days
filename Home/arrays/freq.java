package arrays ; 
import java.util.HashMap;
public class freq {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 5};

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i : arr) {
            if (freq.containsKey(i)) {
                freq.put(i, freq.get(i) + 1);  
            } else {
                freq.put(i, 1); 
            }
        }

        // Print frequencies
        for (Integer key : freq.keySet()) {
            System.out.println(key + " -> " + freq.get(key) + " times");
        }
    }
}
