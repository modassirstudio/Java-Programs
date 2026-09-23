package Code_With_Modassir;
public class CWH_09_Associativity_Of_Operators {
    public static void main(String[] args) {
        // Precedence & Associativity
        // int a = 60*5-40/2;
        /*
        Highest Precedence goes to * and /. They are then evaluated on the basis of left to right Associativity.
        = 60*5-40/2
        = 300-40/2
        = 30-20
        = 280
        */

        // int b = 60/5-40*2;
        /*
        Highest Precedence goes to 8 and /. They are then evaluated on the basis of left to right Associativity.
        = 60/5-40*2
        = 12-40*2
        = 12-80
        = -68
         */
        // System.out.println(a);
        // System.out.println(b);

        /* Quick Quiz : How will you write the following Expressions in Java ?
            A. x-y/2
            B. b*b-4*a*c/2
            c. v*v-u*u
            D. q/r-p*q+r
            E. n*n-(4*m*o)/(2*m)
         */

        /* Q_A : solution
            = 3-8/2
            = 3-4
            = -1
         */

        int x = 3;
        int y = 8;
        int Q_A = x-y/2;
        System.out.println(Q_A);

        /* Q_B : solution
            = 3*3-4*2*4/2
            = 9-4*2*4/2
            = 9-8*4/2
            = 9-32/2
            = 9-16
            = -7
         */

        int a = 2;
        int b = 3;
        int c = 4;
        int Q_B = b*b-4*a*c/2;
        System.out.println(Q_B);

        /* Q_C : solution
            = 7*7-5*5
            = 49-5*5
            = 49-25
            = 24
         */

        int v = 7;
        int u = 5;
        int Q_C = v*v-u*u;
        System.out.println(Q_C);

        /* Q_D : solution
            = 9/3-8*9+3
            = 3-8*9+3
            = 3-72+3
            = -69+3
            = -66
         */

        int p = 8;
        int q = 9;
        int r = 3;
        int Q_D = q/r-p*q+r;
        System.out.println(Q_D);

        /* Q_E : Solution
            = 11*11-(4*4*9)/(2*4)
            = 11*11-(16*9)/(2*4)
            = 11*11-144/(2*4)
            = 11*11-144/8
            = 121-144/8
            = 121-18
            = 103
         */

        int m = 4;
        int n = 11;
        int o = 9;
        int Q_E = n*n-(4*m*o)/(2*m);
        System.out.println(Q_E);
    }
}

