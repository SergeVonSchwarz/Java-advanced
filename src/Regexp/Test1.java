package Regexp;

public class Test1 {
    public static void main(String[] args) {
        String a = "1234";
        System.out.println(a.matches("1234"));
        System.out.println(a.matches("12345"));

        String b = "hello";
        System.out.println(a.matches("Hello"));
    }
}
