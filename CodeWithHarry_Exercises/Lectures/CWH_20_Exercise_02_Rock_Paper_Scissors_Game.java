package Code_With_Modassir;
import java.util.Random;
import java.util.Scanner;
public class CWH_20_Exercise_02_Rock_Paper_Scissors_Game {
    public static void main(String[] args){
        // The Exercise is : Create a Rock_Paper_Scissors_Game
        // 0 is for Rock
        // 1 is for Paper
        // 2 is for Scissors

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 for Rock, 1 for Paper and 2 for Scissors : ");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if(userInput==computerInput){
            System.out.println("Draw");
        } else if (userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1) {
            System.out.println("You Win!");
        } else {
            System.out.println("Computer Win!");
        }

        if(computerInput==0){
            System.out.println("Computer Choice : Rock");
        } else if (computerInput==1) {
            System.out.println("Computer Choice : Paper");
        } else if (computerInput==2) {
            System.out.println("Computer Choice : Scissors");
        }
    }
}
