import java.util.HashSet;

public class dup {
    public static void main(String[] args) {

        int[] a = {1,23,4,5,6,1,23,4,5,7,1 , 9}; 


        HashSet<Integer> seen= new HashSet<>() ; 

        for (int i: a)  {
            if (!seen.add(i) && !seen.contains(i)){
                System.out.println(i);
            }
        }

    }   
}
