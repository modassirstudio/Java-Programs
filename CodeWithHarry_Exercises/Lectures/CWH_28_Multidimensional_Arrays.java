package Code_With_Modassir;

public class CWH_28_Multidimensional_Arrays {
    public static void main(String[] args) {
        int [] marks; // A 1-D Array
        int [] [] flats; // A 2-D Array
        flats = new int[3][4]; // [3] : It shows the row number; [4] : It shows the column number;
        // First Row with Four Columns
        flats [0][0] = 101;
        flats [0][1] = 102;
        flats [0][2] = 103;
        flats [0][3] = 104;
        // Second Row with Four Columns
        flats [1][0] = 201;
        flats [1][1] = 202;
        flats [1][2] = 203;
        flats [1][3] = 204;
        // Third Row with Four Columns
        flats [2][0] = 301;
        flats [2][1] = 302;
        flats [2][2] = 303;
        flats [2][3] = 304;

        for(int i = 0; i<flats.length; i++){
            for(int j = 0; j<flats[i].length; j++){
                System.out.print(flats[i] [j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

//        int [] a = {4, 5, 3, 9};
//        int total = 0;
//        for(int b: a){
//            total = total + b;
//        }
//        System.out.println(total);
    }
}
