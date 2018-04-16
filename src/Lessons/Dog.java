package Lessons;

public class Dog {

    String name;
    int age;
    String color;
    String breed;

    public Dog(String name, String breed, String color, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    public void barking() {
        System.out.println(this.name + " is barking");
    }

    public void hungry () {
        System.out.println(this.name + " is hungry.");
    }

    public void sleeping () {
        System.out.println(this.name + " is sleeping now.");
    }
}
