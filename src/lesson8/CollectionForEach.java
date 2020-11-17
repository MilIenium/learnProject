package lesson8;

import lesson6.OneLinkedList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("ALL")
public class CollectionForEach {

    public static void main(String[] args) {
        Collection<String> phones = new ArrayList<>();
        phones.add("xiaomi");
        phones.add("honor");
        phones.add("samsung");
        phones.add("apple");

        // for (int i ... )
        // foreach
        // for (<Class name> <variable> : <collection object>)
        for (String phone : phones) {
            System.out.println(phone);
        }

//        for (String phone : phones) {
//            if (phone.equals("honor")) {
//                phones.remove(phone);
//            }
//        }
        Iterator<String> iter = phones.iterator();
        while (iter.hasNext()) {
            String phone = iter.next();
            if (phone.equals("honor")) {
                iter.remove();
            }
        }


        System.out.println();
        Iterator<String> phoneIterator = phones.iterator();
        while (phoneIterator.hasNext()) {
            String phone = phoneIterator.next(); // возвращает объект (следующий в коллекции) и передвигает курсор
            System.out.println(phone);
        }

        // List<Integer> countOfPhones = new ArrayList<>();
        List<Integer> countOfPhones = new LinkedList<>();
        countOfPhones.add(43);
        countOfPhones.add(65);
        countOfPhones.add(23);
        countOfPhones.add(68);

        for (int i = 0; i < countOfPhones.size(); i++) {
            System.out.println(countOfPhones.get(i)); // n * n
        }

        for (Integer count : countOfPhones) {
            System.out.println(count); // n
        }

        String[] array = new String[] { "1", "2", "3", "4" };
        // for (int i = 0; i < array.length; i++) { array[i] }
        for (String el : array) {
            System.out.println(el);
        }

        OneLinkedList oneLinkedList = new OneLinkedList();
        oneLinkedList.add(3);
        oneLinkedList.add(5);
        oneLinkedList.add(6);
        for (Integer value : oneLinkedList) {
            System.out.println(value);
        }

        Iterator<Integer> oneLinkedListIterator = oneLinkedList.iterator();
        while (oneLinkedListIterator.hasNext()) {
            System.out.println(oneLinkedListIterator.next());
        }

    }

}
