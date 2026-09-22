package Code_With_Modassir;

import java.util.Scanner;
public class CWH_06_Exercise_01_CBSE_Percentage_Calculator {
    public static void main(String[] args) {

        // Exercise : Write a program to calculate percentage of a given student in CBSE board exam. His marks from the five subjects must be taken as input from the keyboard. Marks are out of 100.

        // Solution :
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Physics Marks : ");
        int physics = sc.nextInt();
        System.out.println("Enter Your English Marks : ");
        int english = sc.nextInt();
        System.out.println("Enter Your Mathematics Marks : ");
        int math = sc.nextInt();
        System.out.println("Enter Your Urdu Marks : ");
        int urdu = sc.nextInt();
        System.out.println("Enter Your Hindi Marks : ");
        int hindi = sc.nextInt();

        float percentage = ((physics + english + math + urdu + hindi)/500.0f)*100;
        System.out.print("Percentage : ");
        System.out.println(percentage + "%");
    }
}
