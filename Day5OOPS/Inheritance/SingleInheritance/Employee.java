package Day5OOPS.Inheritance.SingleInheritance;

public class Employee {
    private   int empid ; 
    private String empname  ; 
    private  float salary ; 

    public void setEmp_Details (){
        java.util.Scanner  scan = new java.util.Scanner(System.in) ; 
        System.out.print("Enter Your ID & Name & Salary :") ;
        this.empid  = scan.nextInt() ; 
        this.empname  = scan.next() ; 
        this.salary = scan.nextFloat () ; 
    }

    public int getId() {
            return this.empid ; 
    }
    public String getName() {
        return this.empname ; 
    }
    public Float getSalary() {
        return this.salary ; 
    }
    
}
