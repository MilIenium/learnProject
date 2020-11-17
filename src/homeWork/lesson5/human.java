package homeWork.lesson5;

// Superclass, baseclass, parent
public class human {

    private int age;
    private String name;
    private String lastName;
    private int height;
    private int weight;

    public human() {}

    public human(int age, String name, String lastName, int height, int weight) {

        this.age = age;
        this.name = name;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;

    }

    public String getName(){
        return name;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public int getHeight(){
        return height;
    }

    public int getWeight(){
        return weight;
    }

}
