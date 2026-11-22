package Code_With_Modassir;
        // Question.1 : Create a class employee with following properties and methods :
        /* Salary(property)(int)
        getSalary(method returning int)
        name(property)(String)
        getName(method returning String)
        setName(method returning name)
         */
        class employee2{
            int salary;
            String name;
            public int getSalary(){
                return salary;
            }
            public String getName(){
                return name;
            }
            public void setName(String n){
                name = n;
            }
        }

        // Question.2 : Create a class cellPhone with methods to print "ringing...", "vibrating..." etc.
        class cellPhone{
            static void ring(){
                System.out.println("ringing...");
            }
            static void vibrate(){
                System.out.println("vibrating...");
            }
            static void callFriend(){
                System.out.println("calling Shilpa...");
            }
        }

        // Question.3 : Create a class square with a method to initialize its side, calculating area and perimeter.
        class square{
            int side;
            public int area(){
                return side * side;
            }
            public int perimeter(){
                return 4 * side;
            }
        }

        // Question.3 : Create a class rectangle and repeat 3
        class rectangle{
            int length;
            int breadth;
            public int area(){
                return length * breadth;
            }
            public int perimeter(){
                return 2*(length + breadth);
            }
        }

        // Question.5 : Create a class pubgPlayer for the game capable of hitting..., firing..., running...etc.
        class pubgPlayer{
            static void hit(){
                System.out.println("Hitting the enemy...");
            }
            static void run(){
                System.out.println("Running from enemy...");
            }

            static void fire(){
                System.out.println("Firing the enemy...");
            }
        }

        // Question.6 : Create a class circle and repeat 3
        class circle{
            float pi = 3.14f;
            int r;
            public float area(){
                return pi * (r * r);
            }
            public float perimeter(){
                return 2 * pi * r;
            }
        }
public class CWH_39_Chapter_08_Practice_Set {
    public static void main(String[] args){

        /* // Question.1 : Answer
        employee2 mod = new employee2();
        mod.setName("Morris");
        mod.salary = 455;
        System.out.println("My name is " + mod.getName());
        System.out.println(mod.getSalary());
        */

        /* // Question.2 : Answer
        cellPhone redmi = new cellPhone();
        redmi.callFriend();
        redmi.vibrate();
        redmi.ring();
        */

        /* // Question.3 : Answer
        square a = new square();
        a.side = 7;
        System.out.format("Area of the Square is %d cm ", a.area());
        System.out.println();
        System.out.format("Perimeter of the Square is %d cm ", a.perimeter());
        */

        /* // Question.4 : Answer
        rectangle b = new rectangle();
        b.length = 7;
        b.breadth = 8;
        System.out.format("The area of the Rectangle is %d cm ",b.area());
        System.out.println();
        System.out.format("The perimeter of the Rectangle is %d cm", b.perimeter());
        */

        /* // Question.5 : Answer
        pubgPlayer player1 = new pubgPlayer();
        player1.hit();
        player1.run();
        player1.fire();
        */

        /* // Question.6 : Answer
        circle c = new circle();
        c.r = 8;
        System.out.format("The area of the Circle is %f cm ",c.area());
        System.out.println();
        System.out.format("The perimeter of the Circle is %f cm", c.perimeter());
        */

    }
}
