package Day12;
// import java.util.Arrays ;

public class cpystr {

    public static void main(String[] args) {
        String a =  "Abc" ; 
        // int size = a.length() ;
        char cpya[] =   new char[a.length()] ;
        char y[] = a.toCharArray(); 

        int it = 0 ;
        while (a.length() != it){
            cpya[it]  =y[it] ; 
            it++; 
        }
        System.out.println("cpy of str : "+ new String(cpya) );
    }
    
}
