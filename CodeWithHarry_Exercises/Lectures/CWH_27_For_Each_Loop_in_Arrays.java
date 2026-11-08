package Code_With_Modassir;

public class CWH_27_For_Each_Loop_in_Arrays {
    public static void main(String[] args) {
        // 1st Topic : Length = We can find the length of the array by using name.length
//        int [] marks = {23, 43, 98, 45, 34};
//        System.out.println(marks.length);
//        System.out.println(marks[2]);

        // We also use the array with other data types
        // Using float
//        float [] marksRatio = {3.2f, 4.7f, 8.0f, 1.9f, 6.3f};
//        System.out.println(marksRatio[3]);

        // Using String
//        String [] studentsName = {"Harry", "Mod", "Nasir", "Aman", "Faiz"};
//        System.out.println(studentsName[4]);

        // 2nd Topic : Displaying an Array
        // Naive Way (Simple Way) to display an array
//        int [] marks = {23, 43, 98, 45, 34};
//        System.out.println(marks.length);
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);

        // Displaying an array using For Loop (Better Way)
//        int [] marks = {34, 54, 55, 83, 28};
//        for(int i = 0; i<marks.length; i++){
//            System.out.println(marks[i]);
//        }

        // Quick Quiz : Write a program to print the elements of an array in reverse order
//        System.out.println("In Reverse Order");
//        int [] marks1 = {34, 54, 55, 83, 28};
//        for(int i = marks1.length - 1; i>=0; i--){
//            System.out.println(marks1[i]);
//        }

        // Displaying an array using For-each Loop (Better Way)
        int [] marks = {23, 54, 27, 45, 90};
        for(int elements: marks){
            System.out.println(elements);
        }
    }
}
