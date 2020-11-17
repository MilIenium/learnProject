package lesson6;


// Список - набор однотипных элементов
// Список на основе массива - динамический массив

// addLast (добавление в конец) - O(n)
// [3, 5, 8] -> [0, 3, 5, 8] -> [2, 3, 5, 8]
// addFirst (добавление в начало) - O(n)
// removeLast (удаление последнего элемента) - O(1)
// removeFirst - O(n)
// addByIndex (добавление в середину), removeByIndex() - O(n)
// getByIndex (получение элемента по индексу) - O(1)
public class ListArray extends AbstractList {

    // [3, 5, 4, null, null, null] (size=3)
    // [3, 5, 4, 0, 0] // (size=3)
    private int[] elements; // length

    public ListArray(int initialCapacity) {
        this.elements = new int[initialCapacity];
    }

    @Override
    public void add(int value) {
        // добавляет значение в конец списка
        if (elements.length == size) {
            int[] oldElements = elements;
            elements = new int[(int)(elements.length * 1.5)];
            // скопировать данные из oldArray в elements
            System.arraycopy(oldElements, 0, elements, 0, oldElements.length);
        }
        // 1 element: size = 0, elements[0] = value, size -> 1
        // 2 element: size = 1, elements[1] = value, size -> 2
        // 3 element: size = 2, elements[2] = value, size -> 3
        elements[size++] = value;
    }

    @Override
    public void remove(int value) {

    }

}