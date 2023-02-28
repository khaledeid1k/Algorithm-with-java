package HashTable;

import java.util.HashMap;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        Map<String, Double> book = new HashMap<>();

        book.put("apple", 0.67);
        book.put("milk", 1.49);
        book.put("avocado", 1.49);

        System.out.println(book);
    }

}
