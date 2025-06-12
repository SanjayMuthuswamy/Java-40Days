package OOPS.Inheritance;

// Base class
class Employee extends Object { // NOT public
    int id;
    String name;
    float salary;

    public void EmployeeMethod() {
        // Default constructor
        System.out.println("Employee Method called");}
        public void getDetails() {
        System.out.println("Employee Details: " + id + ", " + name + ", " + salary);
    }
}

// Child class
class Manager extends Employee {
    // Inherits id, name, salary
    // Additional properties or methods can be added here if needed
    String department;
    public Manager() {
        super() ; 
        department = "HR" ; 
    }
    public void getDetails() {
        // System.out.println("Manager Details: " + id + ", " + name + ", " + salary + ", " + department + super.getDetails());
    }
}

// Main class (this should match the filename)
public class Inheritance {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.id = 1;
        emp.name = "John Doe";
        emp.salary = 50000.0f;

        Manager mgr = new Manager();
        mgr.id = 2;
        mgr.name = "Jane Smith";
        mgr.salary = 70000.0f;

        System.out.println("Employee ID: " + emp.id + ", Name: " + emp.name + ", Salary: " + emp.salary);
        System.out.println("Manager ID: " + mgr.id + ", Name: " + mgr.name + ", Salary: " + mgr.salary + ", Department: " + mgr.department);
        // Note: The department field in Manager is not initialized, so it will be null.
        mgr.EmployeeMethod(); // Calling method from Employee class, demonstrating polymorphism
    }
}
 // base class  to derived class ( execution constructor flow )


//inhertiance allows methods to do different things based on the object that it is acting upon, even if they share the same method name. In this example, we have a base class `Employee` and a derived class `Manager`. The `Manager` class inherits properties from `Employee`, demonstrating basic inheritance in Java.

// In this example, we have a base class `Employee` and a derived class `Manager`. The `Manager` class inherits properties from `Employee`, demonstrating basic inheritance in Java. This is a simple illustration of polymorphism where the derived class can be treated as an instance of the base class, allowing for code reuse and flexibility in handling different types of employees.