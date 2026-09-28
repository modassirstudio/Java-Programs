package Code_With_Modassir;

public class CWH_16_Conditionals_If_else_Statement {
    public static void main(String[] args){
        int a = 19;
        if(a>=18){
            System.out.println("Yes, You can drive!");
        } else {
            System.out.println("No, You can not drive yet!");
        }

        // Other way to find out the output with declare a data type
        int b = 18;
        boolean c = (b>=18);
        if(c){
            System.out.println("You can vote");
        } else {
            System.out.println("You can't vote");
        }

        // if, else, if-else and if-else ladder
        /*
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        age = sc.nextInt();

        if(age>56){
            System.out.println("You are Experienced");
        } else if(age>46){
            System.out.println("You are Semi-Experienced");
        } else if(age>36){
            System.out.println("You are Semi-Semi-Experienced");
        } else{
            System.out.println("You are not Experienced");
        }
         */
    }
}
