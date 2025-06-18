package Day8.Tasks;

import java.util.LinkedList;

public class nodelength {
    public static void main(String[] args) {

        LinkedList<Integer> linked_list  =  new  LinkedList<>() ; 

        for(int i=0 ; i<5  ;  i++){
            linked_list.add(i) ; 
        }

        System.out.println(linked_list.size());
        
    }
}
