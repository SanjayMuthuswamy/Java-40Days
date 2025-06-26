public class adam {
    public static void main(String[] args) {
        int  a= 131;
        int rev  = rev(a) ; //21
        int sq = rev*rev  ;  //441
        int revsq = rev(sq) ; //144
        System.out.println(((a*a) == revsq ) );
    }

    public  static int rev(int a){
        int temp =  a; 
        //  digit  = 0 ; 
        int sum =0  ;
        while(temp!=0){
            int digit = temp%10 ; 
            sum  = sum*10 + digit  ;
            temp/=10 ; 
        }
        return sum; 
    }
}
