package lesson8;

import java.util.Comparator;
import java.util.Map;

public class WordEntryComparator implements Comparator<Map.Entry<String, Integer>> {

    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        Integer value1 = o1.getValue();
        Integer value2 = o2.getValue();

//        if (value1 == value2) {
//            return 0;
//        } else if (value1 > value2) {
//            return 1;
//        } else {
//            return -1;
//        }

        // o1 vs o2
        // return 0 if o1 == o2
        // return <0 if o1 < o2
        // return >0 if o1 > o2
        // return Integer.compare(value1, value2);
        return value2 - value1;
    }

}