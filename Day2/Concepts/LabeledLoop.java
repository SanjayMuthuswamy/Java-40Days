package Day2.Concepts;

public class LabeledLoop {
    public static void main(String[] args) {
        LoopLabel_Name_outer: 
        // Label for the outer loop , any name can be used here
        for (int i = 1; i < 3; i++) {
            LoopLabel_Name_inter: // Label for the inner loop
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    System.out.println("Breaking out of both loops at i=" + i + ", j=" + j);
                    break LoopLabel_Name_outer; // Breaks out of the outer loop
                    // we can use continue LoopLabel_Name_outer; to skip to the next iteration of the outer loop
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
        System.out.println("Exited both loops.");
    } 
}
// Labeled loops allow you to break or continue from an outer loop
// when you have nested loops and want to control the flow of execution more precisely.
// This is useful when you want to break out of multiple nested loops at once.
// In this example, we have an outer loop labeled as LoopLabel_Name_outer and an inner loop labeled as LoopLabel_Name_inter.
