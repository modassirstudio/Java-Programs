package Code_With_Modassir;

public class CWH_26_Introduction_to_Arrays {
    public static void main(String[] args) {
        // There are three main ways to create an array in Java

        // 1. Declaration and then Memory Allocation
        int [] marks1;
        marks1 = new int[5];
        // Initialization
        marks1[0] = 70;
        marks1[1] = 67;
        marks1[2] = 90;
        marks1[3] = 48;
        marks1[4] = 87;
        System.out.println("Print the marks of roll number 2 : " + marks1[2] + " marks");

        // 2. Declaration and Memory Allocation
        int [] marks2 = new int[5];
        // Initialization
        marks2[0] = 70;
        marks2[1] = 67;
        marks2[2] = 92;
        marks2[3] = 48;
        marks2[4] = 87;
        System.out.println("Print the marks of roll number 2 : " + marks2[2] + " marks");

        // 3. Declaration, Allocation and Initialization together
        int [] marks3 = {97, 78, 65, 34, 41};
        System.out.println("Print the marks of roll number 2 : " + marks3[2] + " marks");
    }
}
