package Regexp;

public class Test7 {
    public static void main(String[] args) {

        String a = "Hello world yoo!";

        String mod = a.replace(" ", ".");
        System.out.println(mod);

        /* reg expression in params */
        String b = "Hello657657world567657567567yoo!";
        String modAll = b.replaceAll("\\d+", "-");
        String modFirst = b.replaceFirst("\\d+", "-");
        System.out.println(modAll);
        System.out.println(modFirst);
    }
}
