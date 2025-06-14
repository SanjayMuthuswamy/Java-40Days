package Day5OOPS.Inheritance.MultilevelInheritance;

import java.util.Scanner;

public class EmpIncrement extends Project {

    public void incrementSalary() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the increment amount: ");
        float increment = scan.nextFloat();

        float currentSalary = getSalary();
        float newSalary = currentSalary + increment;
        setSalary(newSalary);  // Set new salary
        System.out.println("New Salary after increment: " + newSalary);
    
    }
                        
    public void getEmpDetails() {
        setEmp_Details(); // Take input
        System.out.println("Employee ID: " + getId());
        System.out.println("Employee Name: " + getName());
        System.out.println("Department: " + getDepname());
        getProject(); // Show project info
        System.out.println("Current Salary: " + getSalary()); 
    }
}
