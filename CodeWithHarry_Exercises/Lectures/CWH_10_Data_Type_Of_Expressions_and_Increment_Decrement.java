package Code_With_Modassir;
public class CWH_10_Data_Type_Of_Expressions_and_Increment_Decrement {
    public static void main(String[] args){
        // Data types of Expressions
        // If we use an operator to add a byte and short, then the data will be "int".
        short a = 4;
        byte b = 5;
        int sum = a + b;
        System.out.println(sum);

        // If we use an operator to add a byte and float, then the data will be "float".
        int d = 5;
        float e = 4.55f + d;
        System.out.println(e);

        // Resulting Data type after Arithmetic Operation on them
        // byte + short -> int
        // short + int -> int
        // long + float -> float
        // int + float -> float
        // char + int -> int
        // char + short -> int
        // long + double -> double
        // float + double -> double

        // Increment and Decrement Operators
        int i = 56;
        // int j = i++; // first j is assigned i (56) then i is incremented
        int k = 67;
        // int l = ++k; // first k is incremented then l is assigned k (68)
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);

        // Quick Quiz
        // What will be the value of the following expression(x)
        /*
           int y = 7;
           int x = ++y * 8;
           value of x ?
        */
        // First y is incremented (8) then x is assigned
        int y = 7;
        int x = ++y * 8;
        System.out.println(x);
    }
}

