package Day2.Concepts;

class Car{
    int model ;
    String name  ; 
    Car(int model, String name) {
        this.model = model; // Assigning the model to the instance variable
        this.name = name;   // Assigning the name to the instance variable
    }
}

public class ClassParameter {
    void displayCar (Car c){
        System.out.println("Model: " + c.model);
        System.out.println("Name: " + c.name);  
    }

    public static void main(String[] args) {
        Car car = new Car(2025 , "HB6"); // Create 
        new ClassParameter().displayCar(car); // Create an instance of ClassParameter and call displayCar method
        // Display the car details          
        // Output: Model: 2025, Name: HB6'
    }
}

//classType parameterName ; 
// In the above code, we define a class `Car` with two parameters: `model` and `name`.
// The `ClassParameter` class has a method `displayCar` that takes an instance of `Car` as a parameter and prints its details.
// In the `main` method, we create an instance of `Car` and pass it to the `displayCar` method to display the car's details.
// This demonstrates how to use class parameters in Java to pass objects to methods.
// The `Car` class serves as a blueprint for creating car objects with specific attributes, and the `displayCar` method allows us to interact with those objects by displaying their properties.
// This is a simple example of how to use class parameters in Java to encapsulate data and methods that operate on that data.
// It showcases the concept of object-oriented programming, where we define classes to represent real-world entities and their behaviors.

