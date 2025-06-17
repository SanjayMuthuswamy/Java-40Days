package Day3.Concepts;

// / Note: Static methods can be called directly without creating an instance of the class.
class Staticclass{
    static int num(){ //satic method
        return 10; 
    }

    public int nonnum (){ // non-static method}
        return 20 ; 
    }
}
public class Staticmethods{

    public static void main(String[] args) {
        System.out.println("Static method called: " + Staticclass.num()); // Calling static method from another class
        Staticclass staticKey = new Staticclass() ; 
        System.out.println("Non-static method called: " + staticKey.nonnum()); // Calling non-static method from another class

        // Calling static method from the same class
        System.out.println("Static method from same class: " + getNum()); // Calling static method from the same class
    }

    static int getNum(){
        return 10; 
    }

    // the program Starts form the Static method 
    static{
        System.out.println("Static block executed before the Main Method"); // Static block executed when the class is loaded
    }
}
