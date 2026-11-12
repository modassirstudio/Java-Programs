package Code_With_Modassir;

public class CWH_32_Method_Overloading {
    static void aJoke(){
        System.out.println("You're a pretty girl 😂");
    }

    static void changeInteger(int a){
        a = 45;
    }

    static void changeArray(int [] arr){
        arr[2] = 42;
    }

    public static void main(String[] args){
        aJoke();

        // Changing an Integer -> It will not change because int is not an object reference
        int x = 98;
        changeInteger(x);
        System.out.println("Now, the new value of x is : " + x);

        // Changing an Array -> It will change because array is an object reference
        int [] y = {34, 56, 87, 98, 34};
        changeArray(y);
        System.out.println("Now, the new value of arr[2] is : " + y[2]);
    }
}
