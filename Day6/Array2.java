import java.util.*;

public class Array2 {
    public static void main(String[] args)
    {
        try (Scanner scan = new Scanner (System.in)) {
            int[] array =  new int[30] ; 
            for (int i=0 ; i<5  ; i++){
                array[i] = scan.nextInt() ; 
            }
            int sumval = 0  ; 
            for(int val : array){
                sumval = sumval+val ; 
            }

            System.out.println((int) sumval/5);
        }
    }
}

//boundary  traversal .[2D Array]
//zigzag traversal or snake traversal.[2D Array]
//spiral traversal .[2D Array]

//wave traversal .[2D Array]
//diagonal traversal .[2D Array]

