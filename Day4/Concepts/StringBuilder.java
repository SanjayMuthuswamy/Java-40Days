package Day4.Concepts;

public class StringBuilder {
    public static void main(String[] args) {
        // Create a StringBuilder object
        java.lang.StringBuilder sb = new java.lang.StringBuilder();

        // Append strings to the StringBuilder
        sb.append("Hello");
        sb.append(" ");
        sb.append("World!");

        // Convert StringBuilder to String
        String result = sb.toString();

        // Print the result
        System.out.println(result); // Output: Hello World!
    }
}
