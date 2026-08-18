package Practices;

import java.util.Scanner;
public class Exercise_1_Marks_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int math, phy, chem, bio, eng;
        System.out.println("Enter Mathematics marks");
        math = sc.nextInt();
        System.out.println("Enter Physics marks");
        phy = sc.nextInt();
        System.out.println("Enter Chemistry marks");
        chem = sc.nextInt();
        System.out.println("Enter Biology marks");
        bio = sc.nextInt();
        System.out.println("Enter English marks");
        eng = sc.nextInt();

        double total = math + phy + chem + bio + eng;
        double percentage = (total * 100) / 500;

        System.out.println("Marks in Mathematics = " + math);
        System.out.println("Marks in Physics = " + phy);
        System.out.println("Marks in Chemistry = " + chem);
        System.out.println("Marks in Biology = " + bio);
        System.out.println("Marks in English = " + eng);

        System.out.println("Total Marks Obtained: " + total);
        System.out.println("Percentage: " + percentage + "%");
        
        sc.close();
    }
}