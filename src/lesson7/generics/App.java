package lesson7.generics;

public class App {

    public static void main(String[] args) {
        // raw type
        GenericListArray array = new GenericListArray();
        array.add("string value");
        array.add(54.3d);
        array.add(new Object());

        // String value = (String) array.get(0);

        GenericListArray<String> stringArray = new GenericListArray<>();
        stringArray.add("string value");
        stringArray.add("list value");
        // stringArray.add(new Object()); << error

        GenericListArray<Integer> integerArray = new GenericListArray<>();
        integerArray.add(786);
        integerArray.add(79686);
        integerArray.add(4456);



    }

}
