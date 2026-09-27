package Code_With_Modassir;
public class CWH_14_String_Methods {
    public static void main(String[] args){
        // Some of the commonly used string methods

        // 1. name.length -> Returns length of string name
        String a = "Williams";
        System.out.println(a);
        int value = a.length();
        System.out.println(value);

        // 2. name.toLowerCase -> Returns a new string which has all the lower case characters from the string name
        String b = "WILLIAMSON";
        System.out.println(b);
        String value2 = b.toLowerCase();
        System.out.println(value2);

        // 3. name.toUpperCase -> Returns a new string which has all the upper case character from teh string name
        String c = "power";
        System.out.println(c);
        String value3 = c.toUpperCase();
        System.out.println(value3);

        // Other way to return the string name
        String c2 = "Morris";
        c2 = c2.toUpperCase();
        System.out.println(c2);

        // 4. name.trim -> Returns a new string after removing all the leading and trailing spaces from the original string
        String d = "     Harry  ";
        // System.out.println(d);
        String value4 = d.trim();
        System.out.println(value4);

        // Other way to return with trim the string name
        String d2 = "   harry     ";
        d2 = d2.trim();
        System.out.println(d2);

        // 5. name.substring(int start) -> Return a substring from start to the end
        String e = "Peter Parker";
        System.out.println(e.substring(2));

        // 6. name.substring(int start, int end) -> Return a substring from start index to the end index. Start index is included and End is excluded
        String f = "Harry Potter";
        String f2 = f.substring(0,12);
        System.out.println(f2);

        // 7. name.replace('r', 'p') -> Returns a new string after replacing r with p. Harry is the name and will return Happy in this case
        String g = "Max ios";
        System.out.println(g);
        // It will replace the x to c.
        System.out.println(g.replace('x', 'c'));

        // 8. name.startsWith("Po") -> Return true if name starts with String "Po". Otherwise false
        String h = "Porter";
        // System.out.println(h);
        System.out.println(h.startsWith("po") + ", It is not start with small p.");

        // 9. name.endsWith("ter") -> Return true if name ends with String "ter". Otherwise false
        String i = "Porter";
        System.out.println(i.endsWith("ter") + ", It is end with ter.");

        // 10. name.charAt(2) -> Returns character at a given index
        String j = "Mod";
        System.out.println(j.charAt(2));

        // 11. name.indexOf("al") -> Returns the index of the given String. For Example :
        // name.indexOf("al") will return 1 which is the first occurrence of al in String "Ball"
        String k = "Ball";
        System.out.println(k.indexOf("al"));

        // 12. name.indexOf("a" 3) -> Returns the index of the given String starting from the index 3(int)
        String l = "Clear";
        System.out.println(l.indexOf("a", 2));

        // 13. lastIndexOf("s") -> Returns the last index of the given String
        String m = "Please Come Close";
        System.out.println(m.lastIndexOf("s"));

        // 14. lastIndexOf("s" 2) -> Returns the last index of the given String before index 2
        String n = "Please Come Close";
        System.out.println(n.lastIndexOf("ome", 9));

        // 15. name.equals("Aka B") -> Return true if the given String is equal to "AkaB". Otherwise false
        String o = "Aka B";
        System.out.println(o.equals("aka B"));

        // 16. name.equalsIgnoreCase("Aka B") -> Returns true if two Strings are equal ignoring the case of characters
        String p = "Aka B";
        System.out.println(p.equalsIgnoreCase("aKA b"));

        // 17. Escape Sequence Characters
        // /n, /t, /', //, /" -> These are the Escape Sequence Characters
        System.out.println("Hello I am a Escape Sequence Character, \" hello ");
        System.out.println("Hello I am a Escape Sequence Character, \t hello ");
    }
}
