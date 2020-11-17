package lesson8;


@SuppressWarnings("ALL")
public class Boxing {

    public static void main(String[] args) {

        Integer i = Integer.valueOf(45); // boxing
        int pi = i.intValue(); // unboxing

        Integer ai = 55; // autoboxing
        int api = ai;   // autounboxing

        Integer i1 = 127;
        Integer i2 = 127;
        Integer i3 = 129;
        Integer i4 = 129;

        // true/false ?
        System.out.println(i1 == i2);
        System.out.println(i3 == i4);

    }

}
