package Day4.Tasks;
import java.util.Scanner ; 

class Mulityp{
    public  int multi(int i , int tablenumber) {
        return i*tablenumber  ; 
    }
}

// class Recursion{
//     public int multiply_ans(int i , int tablenumber){
//         if (n == 0   ){
//             return 0  ; 
//         }
//         else{
//             multiply_ans(i, tablenumber)
//         }
//     }
// }

public class Mulitplicationtable {
  public static void main(String[] args) {
    Scanner scan   =  new Scanner(System.in) ; 
    int multipy_table =  scan.nextInt() ;
    Mulityp mul = new Mulityp() ; 

    int i=1; 
    for ( ; i<4 ; ){
        i++ ; 
        System.out.println(mul.multi(i , multipy_table));
          
    }
  }
    // static int tables_row(int i , int tablenumber) {
    //     return i*tablenumber;
    // }    

}
