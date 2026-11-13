package Code_With_Modassir;

public class CWH_32_Method_Overloading_2nd_Page {

    // Overloading in Java
    // Note : Arguments are Actual
    static void foo(){
        System.out.println("Good Morning Bro!");
    }

    static void foo(int a ){
        System.out.println("Good Morning " + a + " Bro!");
    }

    static int foo(int a, int b){
        return a+b;
    }

    public static void main(String[] args){
        foo();
        foo(5);
        int c ;
        c = foo(3, 5);
        System.out.println(c);
    }
}
