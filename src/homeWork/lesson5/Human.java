package homeWork.lesson5;

// Superclass, baseclass, parent
public class Human {

    private int age;
    private String name;
    private String lastName;
    private int height;
    private int weight;
    private boolean sex;

    public Human() {}

    public Human(int age, String name, String lastName, int height, int weight, boolean sex) {

        this.age = age;
        this.name = name;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
        this.sex = sex;

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

    public boolean getSex(){
        return sex;
    }
    public String toString() {
        String text = "";
        text += "Имя: " + this.name + ", ";
        text += "Фамилия: " + this.lastName;
        text += ", пол: " + (this.sex ? "мужской" : "женский");
        text += ", возраст: " + this.age;

        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Human human = (Human) o;
        return age == human.age &&
                weight == human.weight &&
                name.equals(human.name);
    }

}
