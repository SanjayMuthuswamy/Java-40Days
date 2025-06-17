import java.util.Scanner; 
public class RLtraversal {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in) ; 
        System.out.println("\\\\");
        int size =  scan.nextInt() ;
        int[][] array = new int[size][size] ;
        for (int i = 0 ; i < size ; i++){
            for (int j = 0 ; j < size ; j++){
                array[i][j] = scan.nextInt() ;
            }
        }
    }
}





