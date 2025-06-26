package RECURSION;

public class palindrome {
    public static void main(String[] args) {
        String str  = "madpam" ; 
        int right =str.length()-1 ; 
        int left  =0 ; 

        if(isPalindrome(str , right ,left)){
            System.out.println("The given String is Planidrome");
        }
        else{
            System.out.println("The given String is Not a Planidrome");
        }
    }

    public static boolean isPalindrome(String str , int right , int left){
     
        if (right  <=  left ){
            return true ;  
        }
        if (str.charAt(left) != str.charAt(right)){
            return false ; 
        }
        return isPalindrome(str,--right, ++left) ; 
    }
}
