package Day8.Tasks;
import java.util.Scanner  ; 
import java.util.LinkedList;

class Search {
    public static boolean search( LinkedList<String> ll,  int ele ){
        if (ll.contains(ele)){
            return true  ; 
        }
        return false ;
    }
}


public class searchll { 
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in) ; 
        LinkedList ll =  new LinkedList<>() ;

        // Search s = new Search() ; 

        
        for(int i=0 ; i<5  ;  i++){
            ll.add(i) ; 
        }
        System.out.print("Enter  the element to Search  :");
        int a  = sc.nextInt() ; 

        if (Search.search(ll,a)) 
        {
            System.out.println("FOUND");
        }
        else{
            System.out.println("NOT FOUND");
        }
        


    }
    
}
