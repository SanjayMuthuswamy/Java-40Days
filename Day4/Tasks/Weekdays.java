package Day4.Tasks;
import java.util.Scanner;
public class Weekdays {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number (1-7) for the day of the week: ");
        int day = scan.nextInt();
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid input! Please enter a number between 1 and 7.";
                return; 
        }

        System.out.println(dayName);

    }
}


// import java.util.Scanner;

// public class partice {
// 	public static void main(String[] args) {

// 		String str = "Monday";
// 		switch (str) {
// 			case "Monday":
// 				System.out.println("Today is Monday");
// 				break;
		
// 			default:
// 				break;
// 		}
// 	}
// }