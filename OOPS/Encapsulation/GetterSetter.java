package OOPS.Encapsulation;

class Bank{
    private float balance = 10000 ;

    //getter 
    //does not get any parameter
    //returns the balance
    public float getBalance() {
        return balance;
    }
    //setter
    //takes a float parameter to set the balance
    //does not return anything
    public void setBalance(float balance) {
        this.balance = balance;
    }
}

public class GetterSetter {
    public static void main(String[] args) {
        Bank bank = new Bank();
        
        // Setting the balance using setter
        bank.setBalance(1000.0f);
        
        // Getting the balance using getter
        float currentBalance = bank.getBalance();
        
        System.out.println("Current Balance: " + currentBalance);
    } 
}
//getter ->  A getter is a public method used to access the value of a private variable in a class.
//setter -> A setter is a public method used to modify the value of a private variable in a class.
// In this example, the `Bank` class has a private variable `balance`, and we use a getter method `getBalance()` to retrieve its value and a setter method `setBalance(float balance)` to modify it. The main method demonstrates how to use these methods to access and modify the balance.


// This encapsulation ensures that the balance can only be modified through the setter method, allowing for validation or additional logic if needed in the future.
// Encapsulation is a fundamental principle of object-oriented programming that restricts direct access to an object's data and methods, allowing controlled access through public methods (getters and setters). This helps maintain the integrity of the object's state and promotes better code organization and maintainability.
// Encapsulation is a key principle of object-oriented programming (OOP) that restricts direct access to an object's data and methods, allowing controlled access through public methods (getters and setters). This helps maintain the integrity of the object's state and promotes better code organization and maintainability.
