package Code_With_Modassir;
import java.util.Scanner;
public class CWH_07_Chapter_01_Practice_Set {
    public static void main(String[] args){
        // Question.1 : Write a program to sum three numbers.
        int a = 3;
        int b = 4;
        int c = 5;
        int sum = a+b+c;
        System.out.println(sum);

        // Question.2 : Write a program to Calculate CGPA using marks of three subjects (Out of 100).
        float subject1 = 45;
        float subject2 = 71;
        float subject3 = 45;
        float CGPA = (subject1 + subject2 + subject3)/30;
        System.out.println(CGPA);

        // Question.3 : Write a Java program which asks the user to Enter his/her name and greets them with "Hello <name>, have a good day." text.
        System.out.println("What is Your Name ?");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + ", Have a good day 😊.");

        // Question.4 : Write a Java program to Convert Kilometers to Miles.
        System.out.print("Enter Km to convert into Miles : ");
        Scanner scn = new Scanner(System.in);
        int km = scn.nextInt();
        float result = km * 0.621371f;
        System.out.format("%d km = %f miles", km, result);

        // Question.5 : Write a Java program to detect whether a number entered by the user is integer or not.
        System.out.println("Enter Your Number : ");
        System.out.println(sc.hasNextInt());
    }
}
