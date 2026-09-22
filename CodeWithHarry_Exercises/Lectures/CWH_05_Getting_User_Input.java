package Code_With_Modassir;
import java.util.Scanner;

public class CWH_05_Getting_User_Input {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        // int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("Enter Number 2");
        int b = sc.nextInt();
        // float b = sc.nextFloat();
        float sum = a + b ;
        System.out.print("The Sum of these numbers is : " + sum);
        boolean c = sc.hasNextInt();
        System.out.println(c);
//        String str = sc.next();
        System.out.println("Hi");
        String str = sc.nextLine();
        System.out.println(str);
    }
}
