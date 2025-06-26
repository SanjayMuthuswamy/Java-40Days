import java.util.Scanner;

public class countvow {

    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in) ; 

        String str = s.nextLine() ; 
        // int a = s.nextInt() ;

        System.out.println(fn_name(str , 0 ));

    }
    public static int fn_name(String a  , int i ){
        if (a.length() == i){
            return  0 ; 
        }
        if (a.charAt(i) =='a' ||a.charAt(i) =='e' || a.charAt(i) =='i' ||a.charAt(i)=='o' || a.charAt(i)=='u'  ){
            return 1 + fn_name(a , i+1 ) ; 
        }  
        return fn_name(a , i+1 ) ; 
    }
}
