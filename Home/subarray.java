
public class subarray {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);

        // int size = s.nextInt();

        int targetsum = s.nextInt();
        int size   =  5 ;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        
        // int tempsum = 0;
        // for (int i = 0; i < size; i++) {
            
        //     // int tempsum = 0 ;
        //     if (tempsum == targetsum) {
        //         System.out.println(tempsum);
        //         return;
        //     } else {
        //         tempsum = arr[i] + tempsum;
        //     }

            // for (int i=0 ; i/)

            int sum =0  ; 
            for (int i=0 ;i<size ;  i++){
                sum =0 ; 
                for (int j=i ; j<size ; j++){
                    sum =  arr[j] + sum ;  

                    if (sum == targetsum){
                        System.out.println(i + "-" + j) ; 
                        return ; 
                    }
                }
            }
         System.out.println("No subarray found");
        // for (int i=0 ; i<size ; i++){

        // }
    }
}
