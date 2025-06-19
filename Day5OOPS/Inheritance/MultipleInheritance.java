package Day5OOPS.Inheritance;

interface interface1 {
    public abstract void name();
    // or void name() ;
}

interface interface2 {
    public abstract void regno();
}

class Details implements interface1, interface2 {

    public void sno() {
        System.out.println("Interface own method");
    }

    @Override
    public void name() {
        System.out.println("interface1 - details class");
    }

    @Override
    public void regno() {
        System.out.println("interface2 - details class");
    }
}

class Details2 implements interface1, interface2 {

    public void name() {
        System.out.println("interface1 - details2 class");
    }

    public void regno() {
        System.out.println("interface2 - details2 class");
    }

    public void address() {
        System.out.println("Interface own method  2");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Details d =  new Details() ; 
        Details2 d2  =  new Details2() ; 

        d.name() ; 
        d.regno();
        d.sno()  ; 
        d2.name() ;
        d2.regno();
        d2.address();
       
    }       
}
