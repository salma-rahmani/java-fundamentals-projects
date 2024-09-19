package EncapsulationExample;

public class AnimalClass {
    private String name;
    private String color;
    private int age;

    public AnimalClass(int age, String color, String name) {
        this.setAge(age);
        this.setColor(color);
        this.setName(name);

    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getColor() {
        return color;
    }


    private void setColor(String color) {
        this.color = color;
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "AnimalClass{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
