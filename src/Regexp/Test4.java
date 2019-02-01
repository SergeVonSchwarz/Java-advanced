package Regexp;

public class Test4 {
    public static void main(String[] args) {

        /*
        * ^ - deny
        * [^abc] - all but abc
        *
        * */

        String a = "hello";
        String b = "ahello";

        System.out.println(a.matches("[^abc]*"));
        System.out.println(b.matches("[^abc]*"));
        System.out.println("----------");

        /*
        * . - some symbol
        * .+ - any character set
        * */

        String url1 = "http://www.google.com";
        String url2 = "http://www.yandex.ru";

        System.out.println(url1.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url2.matches("http://www\\..+\\.(com|ru)"));

    }
}
