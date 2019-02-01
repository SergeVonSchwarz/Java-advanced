package Regexp;

public class Test2 {
    public static void main(String[] args) {
        /*
        *  ^ - start of string
        *  $ - end of string
        *  \\d - one digit
        *  \\w - any letter or digit and _ = [a-zA-Z0-9_]
        */

        String a = "demon";
        String b = "1";
        System.out.println(a.matches("\\d"));
        System.out.println(b.matches("\\d"));
        System.out.println("---------");

        /*
        *   + - 1 or more
        *   * - 0 or more
        *   ? - 0 or 1 symbols before        *
        */

        String c = "189668755";
        String d = "1";
        String e = "";
        String f = "-232";
        String g = "+232";

        System.out.println(c.matches("\\d+"));
        System.out.println(d.matches("\\d+"));
        System.out.println(e.matches("\\d+"));
        System.out.println(f.matches("\\d+"));
        System.out.println(f.matches("-\\d+"));
        System.out.println(f.matches("-?\\d+"));
        System.out.println("---------");

        System.out.println(c.matches("\\d*"));
        System.out.println(d.matches("\\d*"));
        System.out.println(e.matches("\\d*"));
        System.out.println(f.matches("\\d*"));
        System.out.println(f.matches("-\\d*"));
        System.out.println(f.matches("-?\\d*"));
        System.out.println("---------");

        /*
        * (x|y|z) - one from more
        */

        System.out.println(f.matches("(\\+|-)?\\d+"));
        System.out.println(g.matches("(\\+|-)?\\d+"));
        System.out.println(c.matches("(\\+|-)?\\d+"));
        System.out.println("---------");

        System.out.println(f.matches("(\\+|-)?\\d*"));
        System.out.println(g.matches("(\\+|-)?\\d*"));
        System.out.println(c.matches("(\\+|-)?\\d*"));
        System.out.println("---------");
    }
}
