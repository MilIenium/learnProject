package lesson6;

// add()
// remove()
// isEmpty()
// getSize()

// abstract class - абстрактный класс
//  - нельзя создать объект абстрактного класса (AC class = new AC());
//  - может содержать объявления методов (абстрактные методы) - методы не имеют тела
//  - наследники обязаны переопределить все абстрактные методы
public abstract class AbstractList implements List {

    protected int size; // количество элементов в списке

    // public abstract void add(int value);

    public abstract void remove(int value);

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
