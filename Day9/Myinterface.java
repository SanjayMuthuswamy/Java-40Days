package Day9;

//THE INTERFACE METHODS MUST BE USED IN THE CLsS WHERE IT IMPLEMENTED  

//INTERFACE  GIVES 100% PURE ABSTRACTION 

public interface Myinterface{
    abstract void draw() ;  // abstract methods 
    abstract void erase() ;   
}


abstract class AbstractClass{
    // Contains concerete class or also abstrct class ,may or maynot be pure abstraaction implemented
}


class Circle  implements Myinterface     {

    @Override 
    public void draw() { // abstract methods 
        System.out.println("Abstract method has been implemented");     
    } 

    public  void erase() {
        System.out.println("Abstract method has been implemented");     

    }
    public void write() {
        System.out.println("Abstract method has been implemented"); //OWN METHOD OF CLASS
    }
            
    public static void main(String[] args) {
        Circle  c = new Circle() ; 
        c.draw() ;    
    }
}


// abstract class -> learn (method) subject  -> department

