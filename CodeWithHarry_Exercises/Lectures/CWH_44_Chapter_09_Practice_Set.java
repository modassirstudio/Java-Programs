package Code_With_Modassir;
// Question.1 : Create a class cylinder and use getters and setters to set its radius and height
class cylinder1{
    private int radius;
    private int height;

    public void setRadius(int r){
        radius = r;
    }
    public int getRadius(){
        return radius;
    }

    public void setHeight(int h){
        height = h;
    }
    public int getHeight(){
        return height;
    }
}

// Question.2 : Use the methods of Question.1 to calculate volume and surface area of the cylinder
class cylinder2{
    private int radius;
    private int height;


    public void setRadius(int r){
        radius = r;
    }
    public int getRadius(){
        return radius;
    }

    public void setHeight(int h){
        height = h;
    }
    public int getHeight(){
        return height;
    }

    public float volume(){
        return (3.14f)*(radius * radius)*(height); // We can use the PI formula 3.14; and we can also use the Math.PI function in Java;
    }
    public float surfaceArea(){
        float curvedSurfaceArea = 2*(3.14f*radius*height);
        float baseSurfaceArea = 2*(3.14f*radius*radius);
        return curvedSurfaceArea + baseSurfaceArea;
    }
}

// Question.3 : Use a constructor and repeat Question.1
class cylinder3{
    int height;
    int radius;
    public cylinder3(int r, int h) {
        height = h;
        radius = r;
    }
}

// Question.4 : Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters.
class Rectangle{
    private int length;
    private int breadth;
    public Rectangle(){
        length = 4;
        breadth = 5;
    }
    public Rectangle(int l, int b){
        length = l;
        breadth = b;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

// Question.5 : Repeat Question.1 for a sphere
class sphere{
    private int radius;
    private int diameter;

    public void setRadius(int r){
        radius = r;
    }
    public int getRadius(){
        return radius;
    }

    public void setDiameter(int d){
        diameter = d;
    }
    public int getDiameter(){
        return diameter;
    }
}

public class CWH_44_Chapter_09_Practice_Set {
    public static void main(String[] args) {

        /* // Question.1 : Answer
        cylinder1 hr = new cylinder1();
        hr.setHeight(5);
        hr.setRadius(4);
        System.out.println("Height is " + hr.getHeight() + " cm and radius is " + hr.getRadius() + " cm");
        */

        /* // Question.2 : Answer
        cylinder2 vol1 = new cylinder2();
        vol1.setRadius(8);
        vol1.setHeight(4);
        System.out.println("Radius of cylinder is : " + vol1.getRadius() + " cm");
        System.out.println("Height of cylinder is : " + vol1.getHeight() + " cm");
        System.out.print("Now, the volume of the cylinder is : " + vol1.volume() + " cm/square");
        System.out.println(" and the surface area of the cylinder is : " + vol1.surfaceArea() + " cm/square");
        */

        /* // Question.3 : Answer
        cylinder3 cy3 = new cylinder3(5, 53);
        System.out.format("Radius and Height of the cylinder3 is %d cm and %d cm", cy3.radius, cy3.height);
        */

        /* // Question.4 : Answer
        Rectangle rec = new Rectangle(5,4);
        System.out.println(rec.getLength());
        System.out.println(rec.getBreadth());
        */

        // Question.5 : Answer
        sphere s = new sphere();
        s.setRadius(27);
        s.setDiameter(54);
        System.out.format("Radius of the sphere is %d cm and Diameter of the sphere is %d cm", s.getRadius(), s.getDiameter());
    }
}
