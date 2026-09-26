package Code_With_Modassir;
import java.util.Scanner;
public class CWH_13_Strings {
    public static void main(String[] args){
        // String name = new String("Mod");
        String name = "Mod"; // Other and easy way to print Your Name
        System.out.println(name);

        // Different types of Print in java

        // 1. Print : No newline at the end
        int a = 2;
        int b = 3;
        System.out.print("The sum of these two numbers is : ");
        System.out.println(a + b);

        // 2. PrintLn : Prints a newline at the end
        int c = 4;
        int d = 5;
        int sum = c + d;
        System.out.println("Sum of these Numbers is : ");
        System.out.println(sum);

        // 3. PrintF
        int pinCode = 560068;
        String place = "Bangalore";
        System.out.printf("Now, I am living in %s and the Pincode of the area is %d.", place, pinCode);

        // 4.Format : Format's work is same as PrintF
        String profession = "Developer";
        int salary = 9;
        System.out.format(" I want to be a %s and want the salary unto %d lacs per year.", profession, salary);

        Scanner sc = new Scanner(System.in);
        // String str = sc.next();
        String str = sc.nextLine();
        System.out.println(str);
    }
}

