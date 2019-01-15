package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        Map<String, String> translation = new HashMap<>();

        translation.put("кот", "cat");
        translation.put("пёс", "dog");
        translation.put("жаба", "frog");

        // нет порядка вывода
        for(Map.Entry entry : translation.entrySet()) {
            System.out.println(entry.getKey() +" : "+ entry.getValue());
        }
    }
}
