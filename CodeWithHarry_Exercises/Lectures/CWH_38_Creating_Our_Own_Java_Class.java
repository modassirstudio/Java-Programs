package Code_With_Modassir;

class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My i'd is " + id + " and my name is " + name);
    }
    public int getSalary(){
        return salary;
    }
}


public class CWH_38_Creating_Our_Own_Java_Class {
    public static void main(String[] args) {
        // System.out.println("This is our custom class");

        Employee emp1 = new Employee(); // Instantiating a new Employee Object
        Employee emp2 = new Employee(); // Instantiating a new Employee Object

        // Setting Attributes for emp1
        emp1.id = 43054;
        emp1.name = "Shane Watson";
        emp1.salary = 34000;

        // Setting Attributes for emp2
        emp2.id = 43055;
        emp2.name = "David Warner";
        emp2.salary = 38000;

        // Printing the Attributes
        emp1.printDetails();
        emp2.printDetails();
        int salary = emp1.getSalary();
        System.out.println("Watson's per month salary is : " +salary);
    }
}
