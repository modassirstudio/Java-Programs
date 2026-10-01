package Code_With_Modassir;
import java.util.Scanner;
public class CWH_19_Chapter_04_Practice_Set {
    public static void main(String[] args){
        // Question.2 : Write a program to find out whether a student is pass or fail; if it requires total 40% and at least 33% in each subject to pass. Assume 3 subjects and takes marks as an input from the user.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Physics Number : ");
        byte a = sc.nextByte();

        System.out.print("Enter Your English Number : ");
        byte b = sc.nextByte();

        System.out.print("Enter Your Mathematics Number : ");
        byte c = sc.nextByte();

        float avg = (a + b + c)/3.0f;
        System.out.println("Your Overall Average Percentage is : " + avg+"%");

        if(avg>=40 && a>=33 && b>=33 && c>=33){
            System.out.println("Congratulations, You have been Promoted for the Next Year 🥳!");
        } else {
            System.out.println("Sorry, You have not Promoted for the Next Year 😔! ");
        }

        // Question.4 : Write a Java program to find out the day of the week given the number [ 1 for Monday, 2 for Tuesday and so on ...]
        System.out.print("Enter Your Admission date this month December = ");
        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

            // Question.6 : Write a program to find out the type of website from the url .com, .org and .in
            Scanner scan = new Scanner(System.in);
            String website = scan.next();
            if(website.endsWith(".org")){
                System.out.println("An Organizational Website");
            } else if(website.endsWith(".com")) {
                System.out.println("A Commercial Website");
            } else if (website.endsWith(".in")){
                System.out.println("An Indian Website");
            }
    }
}


