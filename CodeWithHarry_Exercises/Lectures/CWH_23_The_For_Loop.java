package Code_With_Modassir;

public class CWH_23_The_For_Loop {
    public static void main(String[] args) {
        for(int a = 0; a<=20; a++){
            System.out.println(a);
        }

        // Quick Quiz.1 : Write a program to print first n odd number using a for loop
        System.out.print("Quick Quiz.1 Answer : ");
        int n = 15;
        for(int b = 0; b<n; b++){
            System.out.println(2*b+1);
        }

        // Decrementing For Loop
        System.out.println("Decrementing For Loop ");
        for(int c = 5; c>=0; c--){
            System.out.println(c);
        }

        // Quick Quiz.2 : Write a program to print first n natural numbers in reverse order
        System.out.print("Quick Quiz.2 Answer : ");
        for(int d = 10; d>=0; d--){
            System.out.println(d);
        }
    }
}
