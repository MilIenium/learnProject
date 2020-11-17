package lesson6;

// Связный список

import lesson8.OneLinkedListIterator;

import java.util.Iterator;

// addLast (добавление в конец) - O(n)
// addFirst (добавление в начало) - O(1)
// removeLast (удаление последнего элемента) - O(n)
// removeFirst - O(1)
// addByIndex (добавление в середину), removeByIndex() - O(n)
// getByIndex (получение элемента по индексу) - O(n)
public class OneLinkedList extends AbstractList implements Iterable<Integer> {

    // head <- указатель на начало списка
    private ListElement head;

    @Override
    public void add(int value) {
        ListElement element = new ListElement(value);
        if (head == null) { // << Список пуст
            head = element;
        } else {
            ListElement current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            // current -> last element
            current.setNext(element);
        }
        size++;
        // el.getNext() -> переходим к следующему элементу
    }

    @Override
    public void remove(int value) {

    }

    // [0, 1, 2, 3, 4, 5, 6, 7]
    // 34, 23, 43, 12, 54, 65, 76

    // removeByIndex(3);
    // removeByIndex(4);
    // removeByIndex(23);
    public void removeByIndex(int index) {
        // element - тот, который нужно удалить
        // prev - элемент перед тем, который нужно удалить
        // next - элемент после того, который нужно удалить
        // prev.next -> next
        if (index == 0) { // удалить элемент head
            head = head.getNext();
        } else {
            int currentIndex = 1;
            ListElement previous = head; // previous.next -> current
            ListElement current = head.getNext();

            // for (int currentIndex = 0; currentIndex != index; currentIndex++) {
            //      current = current.getNext();
            // }

            while (currentIndex++ != index) {
                previous = current;
                current = current.getNext();
            }

            // previous - элемент перед тем, который нужно удалить
            // current - искомый элемент (элемент под номером index)
            previous.setNext(current.getNext()); // previous.next = current.next;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new OneLinkedListIterator(head);
    }

}

