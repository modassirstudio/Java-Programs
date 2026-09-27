package Code_With_Modassir;

public class CWH_15_Chapter_03_Practice_Set {
    public static void main(String[] args){
        // Question.1 : Write a java program to convert a string to lowercase
        String a = "SKY";
        a = a.toLowerCase();
        System.out.println(a);

        // Question.2 : Write a java program to replace spaces with underscores
        String b = "My name is Mod.";
        String b2 = b.replace(" ", "_");
        System.out.println(b2);

        // Question.3 : Write a java program to fill in a letter template which looks like this :
        // Letter = "Dear <|name|>, Thanks a lot."
        String c = "Dear <|name|>, Thanks a lot.";
        c = c.replace("<|name|>", "Danish");
        System.out.println(c);

        // Question.4 : Write a java program to detect double and triple spaces in a string
        String d = "This String  contains  double   and triple spaces ";
        System.out.println(d.indexOf("  "));
        System.out.println(d.indexOf("   "));

        // Question.5 : Write a java program to format the following letter using Escape Sequence Character
        // Letter = "Dear Harry, This java course is nice, Thanks a lot."
        String e = "Dear Harry, This java course is nice, Thanks a lot.";
        System.out.println("Dear Harry,\n\tThis java course is nice,\n\t\t\t\t\tThanks a lot.");
    }
}
