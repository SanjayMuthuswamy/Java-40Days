package Day5OOPS.ConceptsandKeyWordS;

class Employee{

    private int empid ; 
    private String name ; 

    public void getInp(){
        java.util.Scanner scan = new java.util.Scanner(System.in);
        this.empid = scan.nextInt() ; 
        this.name  =  scan.next()  ; 
    }
    public int showemp() {
        // empid = 19 ; 
        System.out.println(this.empid + "\n" + this.name +".");
        return 0 ; 
    }   
}

public class  ClassandObject {
    public static void main(String[] args) {

        Employee emp= new Employee() ; 

        emp.getInp()  ; 
        emp.showemp() ;
        
        Employee []em =  new Employee[5] ; 

        Employee []e =  {new Employee()  , new Employee() ,  new Employee() ,  new Employee() , new Employee()} ; 

        //object Creation 
        // emp[0] =  new Employee()  ; 
        // emp[1]  = new Employee() ; 
        // emp[2] = new Employee() ;  ... so onnn

        for (int i=0 ; i<5 ;i++){
            em[i] = new Employee() ; 
            em[i].getInp() ;
            new Employee().getInp() ; 
        }
        for (int i=0 ; i<5   ; i++ ){   
            em[i].showemp() ; 
        }
        for (Employee empde : e) {
            empde.showemp();
        }

    }
}