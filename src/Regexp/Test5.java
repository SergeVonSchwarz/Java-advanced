package Regexp;

public class Test5 {
    public static void main(String[] args) {

        /*
        * {2} - 2 symbols before  (\\d{2})
        * {2,} - 2 or more  (\\d{2,})
        * {2,4} - 2 to 4 symbols  (\\d{2,4})
        *
        * */

        String a = "12";
        String b = "123";
        String c = "123456";

        System.out.println(a.matches("\\d{2}"));
        System.out.println(b.matches("\\d{2}"));
        System.out.println(b.matches("\\d{2,}"));
        System.out.println(b.matches("\\d{2,4}"));
        System.out.println(c.matches("\\d{2,4}"));
        System.out.println(a.matches("\\d{2,4}"));


    }
}
