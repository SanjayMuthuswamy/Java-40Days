package Day8.Tasks;
// import java.util.Array; 

import java.util.ArrayList;
import java.util.List ; 

public class occ {
    public static void main(String[] args) {

        int count =  0 ; 
        ArrayList <Integer>  al = new ArrayList<>(); 
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(30);
        al.add(30);
        al.add(30);

        List <Integer> indx = new ArrayList<>() ; 

        int lastindx  =0 , firstindx = 0 ; 
        for (int i=0 ; i<al.size() ;i++){
            if(al.get(i) == 30){
                firstindx = i ;
                break ;  
            }
        }

        for (int i=al.size()-1 ; i>0 ; i--){
            if(al.get(i) == 30 ){
                lastindx = i ; 
                break ; 
            }
        }

        System.out.println("first idx : " + firstindx + "\n"+ "last idx : "+ lastindx ) ; 
    }  
}
