package Code_With_Modassir;
class MyEmployee{
    private int jNo ; // Jersey Number
    private String name;
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }

    public int getjNo(){
        return jNo;
    }
    public void setjNo(int j){
        jNo = j;
    }
}
public class CWH_40_Access_modifiers_Getters_and_Setters {
    public static void main(String[] args) {
        MyEmployee mod = new MyEmployee();
        mod.setName("Maxwell");
        mod.setjNo(999);
        System.out.println("My name is " + mod.getName());
        System.out.println("My Jersey Number is " + mod.getjNo());
    }
}
