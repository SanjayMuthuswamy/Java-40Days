package OOPS.Polymorphism;
 
//Static Polymoirphism 

class Addition{
    int add (int ...x ){ //varargs method to accept any number of integers
        int sum = 0; 
        for (int num : x) {
            sum += num; // Sum all the integers passed
        }
        return sum; 
    }

    int  add (int x , int y , int z ){
        return x+y  ; 
    }
    float add (float x , float y ){
        return x+y ; 
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Addition addition = new Addition();
        System.out.println("Sum of 2 numbers: " + addition.add(5, 10)); // Calls the first add method
        System.out.println("Sum of 3 numbers: " + addition.add(5, 10, 15 ,19)); // Calls the second add method
        System.out.println("Sum of 2 float numbers: " + addition.add(5.5f, 10.5f)); // Calls the third add method
    }    
}


