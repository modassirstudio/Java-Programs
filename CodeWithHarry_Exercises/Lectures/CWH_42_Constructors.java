package Code_With_Modassir;
class employee3{
    private int id;
    private String name;

    public employee3(){
        id = 6578;
        name = "Wizard";
    }

    public employee3(String myName, int myId){
        id = myId;
        name = myName;
    }
    public employee3(String yourName){
        name = yourName;
    }
    public employee3(int myId){
        id = myId;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}
public class CWH_42_Constructors {
    public static void main(String[] args){
        employee3 mod = new employee3("Archer", 6545);
        employee3 mod2 = new employee3();
        employee3 mod3 = new employee3("Balloon");

        // mod.setId(5432);
        // mod.setName("Valkyrie");

        System.out.format("My I'd number is %d and My name is %s.", mod.getId(), mod.getName());
        System.out.println();
        System.out.format("My I'd number is %d and My name is %s.", mod2.getId(), mod2.getName());
        System.out.println();
        System.out.format("My name is %s.", mod3.getName());
    }
}
