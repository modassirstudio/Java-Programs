package Code_With_Modassir;
import java.util.Scanner;
public class CWH_12_Chapter_02_Practice_Set {
    public static void main(String[] args){
        // Question.1 : What will be the result of the following Expression : float a = 7/4 * 9/2
        /*
         = 7/4 * 9/2
         = 1 * 9/2 // here the remaining is 1 because the expression is in integer
         = 9/2 // same goes here
         = 4.0 // and the answer is 4 and the .0 is because I used float
        */

        float a = 7/4 * 9/2;
        System.out.println(a);

        // if I change the int into float then the answer will right what we find out
        float b = 7/4.0f * 9/2.0f;
        System.out.println(b);

        // Question.2 : Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
        char grade = 'c';
        grade = (char)(grade + 1);
        System.out.println(grade);

        // Decrypting the grade
        grade = (char)(grade - 1);
        System.out.println(grade);

        // Question.3 : Use Comparison to find out whether a given is greater than the user entered number or not.
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        System.out.println(c>8);

        // Find the value of the following expression
        /*
           int x = 7;
           int y = 7*49/7 + 35/7
           find the value of y
         */
        /* Solution :
           = 7*49/7 + 35/7
           = 343/7 + 35/7
           = 49 + 35/7
           = 49 + 5
           = 54
         */
        int x = 7;
        int y = 7*49/7 + 35/7;
        System.out.println(y);


    }
}


