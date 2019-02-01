package Regexp;

import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {
        String a = "Hello world yoo!";
        String b = "Hello.world.yoo!";
        String c = "Hello345345world343452345yoo!";

        String[] words1 = a.split(" ");
        System.out.println(Arrays.toString(words1));

        String[] words2 = b.split("\\.");
        System.out.println(Arrays.toString(words2));

        String[] words3 = c.split("\\d+");
        System.out.println(Arrays.toString(words3));
    }
}
