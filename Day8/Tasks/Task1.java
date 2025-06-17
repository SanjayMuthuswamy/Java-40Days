package Day8.Tasks;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List <Integer>  al =  new ArrayList<>() ; 
        for (int i=0 ;  i<5 ; i++){
            java.util.Scanner scan = new java.util.Scanner(System.in);
            // System.out.print("Enter a number: ");
            int num = scan.nextInt();
            al.add(num);
        }
        List <Integer> al2  = new ArrayList<>() ;
        // System.out.println(al); 
        // for (int  obj : al){
        //     if (obj > 35){            
        //         al2.add(obj) ; 
        //     }
        // }
        al.forEach(num -> {
            if(num >= 35){
                al2.add(num) ; 
            }
        });

        System.out.println(al2) ;


    }
}
