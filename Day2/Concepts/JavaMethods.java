package Day2.Concepts ; 

class Addition {
    // Method that takes two integers and returns their sum
    public static int add(int a, int b) {
        return a + b;
    }
    public static int sub (int a  , int b ){
        return a  - b ;
    }
}

class AdditionInstance {
    // Instance method that takes two integers and returns their sum
    public int add(int a, int b) {
        return a + b;
    }
}

public class JavaMethods {
 public static void main(String[] args) {

        int sum = Addition.add(5, 10); // Static method call without creating an instance
        int sub = Addition.sub(5 , 10) ; 
        System.out.println("Sum 1: " + sum  + "\n" + "Sub :" + sub); // Output: Sum: 15      
        
        AdditionInstance additionInstance = new AdditionInstance(); // Create an instance of Addition 
        System.out.println("Sum 2: " + additionInstance.add(20, 30)); // Output: Sum: 50 // Using instance method call
    }
}