package Day8.Tasks;

import java.util.LinkedList;

public class removeKthnode {
    public static void main(String[] args) {
        //remove every kth node in linked list

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.add(8);
        ll.add(9);
        ll.add(10); 

        int k = 2;
        int count = 0;
        // for (int i = 0; i < ll.size(); i++) {
        //     count++;
        //     if (count == k) {
        //         ll.remove(i);
        //         count = 0;
        //         i--; 
        //     }
        // }

        for (int i=0  ; i< ll.size() ;i++){
            if (count == k){
                k = k+ 2 ; 
                ll.remove(i) ; 

            }
        }
        System.out.println(ll);
    }
}



//find the lenght of the node .  
//search in a linked list .
//delete a given item/ index .
//find the Nth node from st and last . 


