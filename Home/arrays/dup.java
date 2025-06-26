package arrays;
import java.util.* ; 

public class dup {
    public static void main(String[] args) {
        int[] arr = {1,23,4,56,6,56} ; 
        HashSet<Integer > hamap = new HashSet<>(); 
        HashSet<Integer > dup = new HashSet<>(); 
        
        for (int i :  arr){
            System.out.println(hamap.add(i) );
            System.out.println(i );

            if(!hamap.add(i)){
                dup.add(i) ; 
            }
            // hamap.add(i) ; 
        }
        System.out.println(dup);

        // System.out.println(  hamap.size()==arr.length ?"No Duplicates Found":"Found Duplicates");
    }
}
