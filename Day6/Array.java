import java.util.Arrays ; 

class Array {
    
    public static void main(String[] args) {

        int[] array = new int[5];
        // int a ; 
        for (int i = 0; i < array.length; i++) {
            java.util.Scanner scan = new java.util.Scanner(System.in);
            array[i] = scan.nextInt();
        }
            for (int a1 : array) {
                // array[a] = 0; 
                a1 = 0  ; 
                System.out.print(a1);
            }
        System.out.println(Arrays.toString(array));
    }
}