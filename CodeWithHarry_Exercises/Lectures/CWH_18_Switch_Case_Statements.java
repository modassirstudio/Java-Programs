package Code_With_Modassir;
import java.util.*;
public class CWH_18_Switch_Case_Statements {
    public static void main(String[] args) {

        // Switch Case Control Instruction
        String age = "Shubham";
        switch (age){
            case "Shubham":
                System.out.println("You are an adult!");
                break;
            case "Sachin":
                System.out.println("You are going to get a job!");
                break;
            case "Khan":
                System.out.println("You are ready to get retired!");
                break;
            default:
                System.out.println("Enjoy Your Life!");
        }

        // Switch with enhanced control statement
        String var = "Shubham";
        switch (var) {
            case "Shubham" -> System.out.println("You are an adult!");
            case "Cummins" -> System.out.println("You are going to get a job!");
            case "Warner" -> System.out.println("You are ready to get retired!");
            default -> System.out.println("Enjoy Your Life!");
        }
        System.out.println("Thanks for using my java code");

    }
}
