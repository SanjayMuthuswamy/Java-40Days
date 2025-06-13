package Day5OOPS.ConceptsandKeyWordS;
import java.util.* ; 
class Constructor_Books{
    private int bookid = 99 ; 
    private String  title ;
    private double  cost  ;

    public Constructor_Books() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Value :" + this.bookid + this.title + this.cost) ;
        this.bookid =  scan.nextInt() ; 
    }
    public void Books(int bookid ) {
        System.out.println(bookid) ; 
    }
    public Constructor_Books(int bookid , String title , int cost) {
        this.bookid =  bookid  ; 
        System.out.println(bookid);
    }
}
public class Constructor {
    public static void main(String[] args) {
        Constructor_Books books= new Constructor_Books(10,"San" ,10) ; 
        books.Books(10) ; 
    }
}





