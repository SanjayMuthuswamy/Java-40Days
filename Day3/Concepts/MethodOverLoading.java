package Day3.Concepts;
  

 class Sum{

    public  void sumofNumber(){
        int a = 10; 
        int b = 20; 
        int sum = a + b ; 
        System.out.println("Sum of two numbers is : " + sum); // Output: Sum of two numbers is : 30
    } 
 }

public class MethodOverLoading {
    public static void main(String[] args) {
        System.out.println(add(1 ,2 )) ; 
        System.out.println(add(1.5 ,2.5 )) ;
    
    Sum s =  new Sum() ; 
    s.sumofNumber(); // Calling the instance method to sum two numbers 
    }

    public static int add(int a, int b ){
        return a + b;
    }
    public static double add(double a, double b){
        return a + b;
    }

  


    // Method overloading allows us to define multiple methods with the same name but different parameter types or counts.
    // This is useful for creating methods that can handle different types of input without needing to change the method name.
    // The Java compiler determines which method to call based on the arguments passed to the method.
    // Method overloading is a compile-time polymorphism feature in Java.

}