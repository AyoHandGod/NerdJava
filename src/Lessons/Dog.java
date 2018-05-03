package Lessons;

public class Dog {

    protected String name;
    protected int age;
    protected String color;

    public Dog(){
        name = "stray";
        age = 99;
        color = "dirty";
    }

    public Dog(String name){
        this.name = name;
    }

    public Dog(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName) {
        System.out.println(name + "'s name is now " + newName);
        name = newName;
    }
}
