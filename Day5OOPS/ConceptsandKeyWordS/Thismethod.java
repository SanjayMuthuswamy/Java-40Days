package Day5OOPS.ConceptsandKeyWordS;

class  Staff {

    int id  ;
    String name;
    float salary;  

    Staff(){
        id = 10;
        name = "Unknown";
        salary = 10000.0f;
    }
    //this() is used to call another constructor in the same class
    Staff(int id ){
        this()  ; // Calls the default constructor to initialize name and salary
        this.id = id; // Sets the id to the provided value
    }
    Staff(int  id , String name ){
        this(id); // Calls the constructor with one int parameter to initialize id, name will be null
        this.name = name; // Sets the name to the provided value
    }
}

public class Thismethod {
    public static void main(String[] args) {
        Staff s = new Staff(101, "John Doe");   // Create an instance of Staff with id and name
        System.out.println("ID: " + s.id);
        System.out.println("Name: " + s.name); // This will print null since name is not initialized
        System.out.println("Salary: " + s.salary);
    }
}
