package lesson7.generics;

public interface GenericList<T> {

    void add(T value);

    T get(int index);

}
