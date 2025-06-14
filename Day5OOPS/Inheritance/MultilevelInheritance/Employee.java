package Day5OOPS.Inheritance.MultilevelInheritance;

import java.util.Scanner;

public class Employee {
    private int empid;
    private String empname;
    private float salary;
    private String depname;

    public void setEmp_Details() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your ID, Name, Salary, Department: ");
        this.empid = scan.nextInt();
        this.empname = scan.next();
        this.salary = scan.nextFloat();
        this.depname = scan.next();
    }
    public int getId() {
        return this.empid;
    }

    public String getName() {
        return this.empname;
    }

    public float getSalary() {
        return this.salary;
    }

    public String getDepname() {
        return this.depname;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
