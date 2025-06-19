package Day5OOPS.Encapsulation;

import java.util.Scanner;

public class EncapsulationMain {
    
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

// Its is like ATM  , the user wont know  where the data is stoored in the backend file  . In the backend theere is a method for each variables as get(variable) and gives to the front user. 


//Hiding data ,  is encapsulation
//Hiding implementations abstraction