package Code_With_Modassir;

public class CWH_33_Variable_Arguments_VarArgs {
    /* static int sum(int a, int b){
        return a + b;
    }
    static int sum(int a, int b, int c){
        return a + b + c;
    }
    static int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }
    static int sum(int a, int b, int c, int d, int e){
        return a + b + c + d + e;
    }
     */

    static int sum(int ...array){
        int a = 0;
        for(int e: array){
            a += e;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to VarArgs Tutorial");
        System.out.println("The sum of 4 and 5 is : " + sum(4, 5));
        System.out.println("The sum of 3, 4 and 5 is : " + sum(3,4, 5));
        System.out.println("The sum of 2, 3, 4 and 5 is : " + sum(2,3,4, 5));
        System.out.println("The sum of 10, 2, 3, 4 and 5 is : " + sum(10,2,3,4, 5));

//        int [] marks = {5, 4, 3, 8, 20};
//        int add = 0;
//        for(int element: marks){
//            add += element;
//        }
//        System.out.println("The addition of these five numbers is : " + add);
    }
}
