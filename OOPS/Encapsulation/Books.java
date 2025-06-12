package OOPS.Encapsulation;

class Book  {
    private int id ; 
    private boolean availability ; 
    private String bookName ; 

    //Getter ID and Setter ID 
    public int getId() {
        return id ; 
    }
    public void setId(int id ) {
        this.id  =  id ;
    }

    //Getter ava..  and Setter ava...
    public boolean isAvailability() {
        return availability;
    }
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

}
public class Books {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setId(101);
        book1.setBookName("Java Programming");
        book1.setAvailability(true);

        System.out.println("Book ID: " + book1.getId());
        System.out.println("Book Name: " + book1.getBookName());
        System.out.println("Availability: " + (book1.isAvailability() ? "Available" : "Not Available"));
    }
    
}
// Encapsulation is a fundamental principle of object-oriented programming that restricts direct access to an object's data and methods, allowing controlled access through public methods (getters and setters). This helps maintain the integrity of the object's state and promotes better code organization and maintainability.