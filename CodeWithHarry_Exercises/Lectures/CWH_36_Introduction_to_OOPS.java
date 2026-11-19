package Code_With_Modassir;

public class CWH_36_Introduction_to_OOPS {
    static class pen{
        String color;
        String type; // ballpoint or gel
        public void write(){
            System.out.println("Writing Something");
        }
    }

    public static void main(String[] args) {
        // Only got introduction about oops classes and objects in this chapter
        pen pen1 = new pen();
        pen1.color = "Blue";
        System.out.println(pen1.color);
        pen1.type = "Ballpoint";
        System.out.println(pen1.type);
        pen1.write();
    }
}
