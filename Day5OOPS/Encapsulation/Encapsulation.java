package Day5OOPS.Encapsulation;

import java.util.Scanner;
class Book {

    private int bookid ;
    private String bookname ;
    //
    public void setBook(int bookid ,  String authname) {
        this.bookid = bookid  ; 
        this.bookname =  authname  ; 
    }
    //Getter
    public int getBook(){
        return bookid ; 
    }
    public int BookI(){
        return bookid ; 
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Book book = new Book();
        book.setBook(2,"SANJAY") ; 

        System.out.println(book.BookI());
        
        // System.out.println("Book ID: " + book.getBook());
        // System.out.println("Book Name: " + book.bookname);
        // Note: The bookname is not accessible directly because it is private.   
    }
}
