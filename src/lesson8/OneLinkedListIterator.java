package lesson8;

import lesson6.ListElement;

import java.util.Iterator;

public class OneLinkedListIterator implements Iterator<Integer> {

    private ListElement cursor; // << какой объект будет следующим

    public OneLinkedListIterator(ListElement head) {
        this.cursor = head;
    }

    @Override
    public boolean hasNext() {
        return cursor != null;
    }

    @Override
    public Integer next() {
        Integer value = cursor.getValue();
        cursor = cursor.getNext();
        return value;
    }

}
