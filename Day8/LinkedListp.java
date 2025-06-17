package Day8;

import java.util.LinkedList;

public class LinkedListp {
    public static void main(String[] args) {
        // LinkedList<String> linkedlist   =  new LinkedList<>() ;
        LinkedList<String> linkedlist = new LinkedList<>();

        linkedlist.add("value1") ; 
        linkedlist.add("value2") ;
        System.out.println(linkedlist) ;
        
        linkedlist.offerFirst("value-n ") ;
        // linkedlist.add("value 1") ; 
        System.out.println(linkedlist); 

        System.out.println(linkedlist.peek());


    }
    
}


