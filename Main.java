public class Main {
    public static void main(String[] args) {
        Student s = new Student();   // Create object

        // Use setter methods
        s.setRollNo(101);
        s.setName("Rahul");

        // Use getter methods
        System.out.println("Roll No: " + s.RollNo());
        System.out.println("Name: " + s.Name());
    }
}
