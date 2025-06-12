package Day4.Tasks;
 import java.util.Scanner;
public class TrafficSingal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println(" (Red, Green, Yellow): ");    
        String signal = scan.nextLine();
        String action;
    
        action = (signal.equals("Red")) ? "Stop" : 
                        (signal.equals("Green")) ? "Go" : 
                        (signal.equals("Yellow")) ? "Caution" : "Unknown Signal";
        System.out.println(action) ; 
    }
}
