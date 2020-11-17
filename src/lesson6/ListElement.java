package lesson6;


public class ListElement {

    // next;
    private ListElement next;
    private int value;

    public ListElement(int value) {
        this.value = value;
        this.next = null;
    }

    public ListElement getNext() {
        return next;
    }

    public void setNext(ListElement next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
