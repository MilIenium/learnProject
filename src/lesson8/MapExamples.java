package lesson8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapExamples {

    public static void main(String[] args) {

        // Map<Point, Integer> points = new HashMap();
        // Point p1 = new Point();
        // points.put(p1, 453);

        // один ключ - несколько значений
        // Map<String, List<Integer>> group;
        Map<String, List<Integer>> groups = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        groups.put("быстрые", list);
        // groups.put("быстрые", new ArrayList<>());
        // groups.put("быстрые", null);


        HashMap<String, Integer> words = new HashMap<>();
        // Map<String, Integer> words = new HashMap<>();

        words.put("the", 234); // value - 234, key - "the"
        words.put("a", 235);
        words.put("phone", 45);
        words.put("Java", 68);
        words.put("coffee", 124);
        words.put("chocolate", 34);

        // Map<Integer, Boolean> rooms = new HashMap<>();
        // rooms.put(45, false);
        // rooms.put(12, true);

        // words.put("phone", 56);

        // Через ключи
        Set<String> keys = words.keySet();
        for (String key : keys) {
            Integer value = words.get(key);
            System.out.println("key: " + key + ", value: " + value);
        }

        // Через entries
        Set<Map.Entry<String, Integer>> entries = words.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }

        // List<Integer> numbers = new ArrayList<>();
        // Set<Integer> uniqueNumbers = new HashSet(numbers);
        List<Map.Entry<String, Integer>> listEntries = new ArrayList<>(entries);

        WordEntryComparator wordEntryComparator = new WordEntryComparator();
        int compare = wordEntryComparator.compare(listEntries.get(0), listEntries.get(1));

        listEntries.sort(wordEntryComparator);

        System.out.println("Sorted:");
        for (Map.Entry<String, Integer> entry : listEntries) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }


    }

}
