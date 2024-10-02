package InheritanceActivity;

class Animal {

    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void eat() {
        System.out.println(name + " eats fish.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}


class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    public void fly() {
        System.out.println(name + " is flying.");
    }
}
