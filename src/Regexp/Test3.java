package Regexp;

public class Test3 {
    public static void main(String[] args) {

        /*
        *   [abc] = (a|b|c)
        *   [a-zA-Z] - all english letters
        *   [0-9] = \\d
        */

        String a = "a34534";
        String b = "adsf34534";

        System.out.println(a.matches("[a-zA-Z]?\\d+"));
        System.out.println(b.matches("[a-zA-Z]?\\d+"));
        System.out.println(b.matches("[a-zA-Z]+\\d+"));
        System.out.println("---------");

        String c = "a1d31s3f34534";
        System.out.println(c.matches("[a-zA-Z]+\\d+"));
        System.out.println(c.matches("[a-zA-Z31]+\\d+"));
    }
}
