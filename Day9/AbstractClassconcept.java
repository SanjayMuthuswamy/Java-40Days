package Day9;

abstract class Abstractclass {
    String dpt  ;

    public void department(){
        System.out.println("Welcome " + dpt);
    }

    abstract void learn(String dpt_name)  ;
    abstract void sub() ;  
}

class Aids extends Abstractclass {
    
    public void learn(String dpt_name) {
        System.out.println("You are Learning " + dpt_name);
    }
    
    public void sub() {
        System.out.println("You are Have 2Labs (DS, AI ,  PowerBI) " );
    }
}

class Aiml extends Abstractclass {
    
    public void learn(String dpt_name) {
        System.out.println("You are Learning " + dpt_name);
    }


    public void sub() {
        System.out.println("You are Have 3Labs (ML , AI , DL) " );
    }

}


public class AbstractClassconcept{
    public static void main(String[] args) {

        //We cant create  a instance for the Abstract class
        Aids dpt1 = new Aids() ; 
        Aiml dpt2 = new Aiml() ; 

        dpt1.dpt = "BIT" ; 
        dpt1.department(); 

        dpt1.learn("AIDS");
        dpt1.sub() ; 

        dpt2.learn("AIML");
        dpt2.sub();

    }
}                  
                  