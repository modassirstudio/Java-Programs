package Code_With_Modassir;

public class CWH_35_Chapter_07_Practice_Set {
    // Question.1 : Write a java method to print multiplication of a number n.
    static void tableNo(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }

    /* Question.2 : Write a program using functions to print the following pattern :
     *
     **
     ***
     ****
     */
    static void star(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Question.3 : Write a recursive function to calculate sum of first n natural numbers
    static int recursiveSum(int n){
        if(n==1){
            return 1;
        }
        return n = n + recursiveSum(n - 1);
    }

    /* Question.4 : Write a program using functions to print the following pattern :
     ****
     ***
     **
     *
     */
    static void reverseStar(int n){
        for(int i = 1; i>=n; i--){
            for(int j = 1; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // Question.5 : Write a function to print nth term of Fibonacci Series using recursion
    // Fibonacci Series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...
    static int fibSeries(int n){
//        if(n==1){
//            return 0;
//        } else if (n==2) {
//            return 1;
//        }
        if(n==1 || n==2){
            return n-1;
        }
        else {
            return fibSeries(n-1) + fibSeries(n-2);
        }
    }

    // Question.6 : Write a function to find average of a set of numbers passed as arguments
    static float calcAverageOfSetOfNo(float... calc){
        float sum = 0;
        for(float e: calc){
            sum += e;
        }
        return sum/calc.length;
    }

    // Question.7 : Repeat question 4 using recursion
    static int recStar(int n){
        for(int i = 1; i>=n; i--){
            for(int j = 1; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        return n;
    }

    // Question.8 : Repeat question 2 using recursion
    static void revRecStar(int n) {
        if(n>0){
            revRecStar(n - 1);
            for(int i = 0; i<n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Question.9 : Write a function to convert Celsius Temperature to Fahrenheit
    static void celToF(float n){
        float formula = ((n * 9/5f) + 32f);
        System.out.println("8 degree Celsius = " + formula + " degree Fahrenheit");
    }

    // Question.10 : Repeat 3 using iterative approach

    public static void main(String[] args) {
        // tableNo(15); // Question.1 : Answer running

        // star(5); // Question.2 : Answer running

         int c; // Question.3 : Answer running
         c = recursiveSum(4);
         System.out.println(c);

        // reverseStar(4); // Question.4 : Answer is not done

        // int result = fibSeries(1); // Question.5 : Answer running
        // System.out.println(result);

        // float avr1 = calcAverageOfSetOfNo(1, 2, 3, 4, 5, 6, 7); // Question.6 : Answer running
        // System.out.println("The average of the set of 7 numbers is : " + avr1);

        // int star = recStar(4);  // Question.7 : Answer is not done
        // System.out.println(star);

        // revRecStar(4); // Question.8 : Answer running

        // celToF(18); // Question.9 : Answer running

        // Question.10 : Answer is not done
    }
}