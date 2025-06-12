// File name: ConstructorDemo.java
package Day1;

class ConstructorDemo {
    int roll;
    String name;

    // Default constructor
    ConstructorDemo() {
        roll = 100;
        name = "Default Name";
    }
    // Parameterized constructor
    ConstructorDemo(int roll) {
        this();  // Call default constructor
        this.roll = roll;
        System.out.println("Parameterized constructor");
    }
}

public class ConstructorTest {
    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo(101); // Using parameterized constructor
        System.out.println("Roll: " + obj.roll + ", Name: " + obj.name);
    }
}
