package Code_With_Modassir;

public class CWH_24_Break_and_Continue {
    public static void main(String[] args) {
        //  Break and Continue using Loops
        for(int a = 0; a<=5; a++){
            if(a==2){
                System.out.println("Ending The Loop");
                continue;
            }
            System.out.println(a);
            System.out.println("Java is Great");
        }
    }
}
