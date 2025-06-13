package Day5OOPS.Inheritance.SingleInheritance;

//Inhertied from the Employee class 

public class EmpDepartment  extends Employee{

    private String depname  =  "Admin" ; 
    public void  getdpt() {
        setEmp_Details();
        System.out.println( "Emp ID : "+getId() +  "\n" +"EmpName : "+ getName() +"\n"+ "Salary : " + getSalary() + "\n"+ "Department : "+ depname);
    } 
}
