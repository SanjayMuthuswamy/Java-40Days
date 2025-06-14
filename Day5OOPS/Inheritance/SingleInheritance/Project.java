package Day5OOPS.Inheritance.SingleInheritance;

//Inhertied from the Employee class 

public class Project  extends Employee{

    public void  getdpt() {
        setEmp_Details();
        System.out.println( "Emp ID : "+getId() +  "\n" +"EmpName : "+ getName() +"\n"+ "Salary : " + getSalary() + "\n"+ "Department : "+ getDepname() + "\n");
    } 
}
