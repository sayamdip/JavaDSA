package Java_Theory_Codes.BasicJava.DicisionMaking;
import java.util.*;

public class WeekendsAndWeekdaysSwitch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Day= ");
        String str=sc.nextLine();
        switch(str){
            case "Monday":
            case "monday":
            case "Tuesday":
            case "tuesday":
            case "Wednesday":
            case "wednesday":
            case "Thursday":
            case "thursday":
            case "Friday":
            case "friday":
                System.out.println("Weekday");
                break;
            case "Saturday":
            case "saturday":
            case "Sunday":
            case "sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("You Have Entered Invalid Day.");
        }
    }
}
