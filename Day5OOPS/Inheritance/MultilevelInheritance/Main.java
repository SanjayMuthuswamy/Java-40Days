package Day5OOPS.Inheritance.MultilevelInheritance;

public class Main {
    public static void main(String[] args) {
        EmpIncrement emp = new EmpIncrement(); // Object of child class
        emp.incrementSalary(); // Apply increment
        emp.getEmpDetails(); // Call all methods in inheritance chain
    }
}
