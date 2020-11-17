package homeWork.lesson3;

public class calculator {

    int x;
    double y;
    long z;

    public double add(int a, double y){
        double c;
        c = a + y;

        return c;
    }

    public int add(int a, long z){
        int q;
        q = (int) (a/z);

        return q;
    }

    public double add(double y, long z){
        double x;
        x = y * z;

        return x;
    }

    public int add(int a, double y, long z){
        int v;
        v = (int) (a - y - z);

        return v;
    }

}
