package Code_With_Modassir;

public class CWH_34_Recursion {
    // Factorial n = n * n-1 * ...1
    // Factorial n = n * factorial(n-1) * ...1
    // Factorial 5 = 5 * 4 * 3 * 2 * 1 = 120
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        } else{
            return n + factorial(n - 1);
        }
    }

    static int factorial_iterative(int m){
        if(m==0 || m==1){
            return 1;
        } else{
            int ret = 1;
            for(int i = 1; i<=m; i++){
                ret *= i;
            }
            return ret;
        }
    }

    public static void main(String[] args) {
        int x = 6;
        int y = 5;
        System.out.println("The factorial of 6 is :" + factorial(x));
        System.out.println("The factorial of 5 is :" + factorial_iterative(y));
    }
}
