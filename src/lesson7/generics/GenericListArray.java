package lesson7.generics;


// type erasure
public class GenericListArray<TYPE> implements GenericList<TYPE> {

    private Object[] elements = new Object[5];
    private int size;

    public void add(TYPE value) {
        // TYPE v = new TYPE();
        // TYPE[] arr = new TYPE[3];
        // 1 element: size = 0, elements[0] = value, size -> 1
        // 2 element: size = 1, elements[1] = value, size -> 2
        // 3 element: size = 2, elements[2] = value, size -> 3
        elements[size++] = value;
    }

    public TYPE get(int index) {
        //noinspection unchecked
        return (TYPE) elements[index];
    }

}
