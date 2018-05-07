package Lessons;

public class Dog {

    protected String name;
    protected int age;
    protected String color;
    protected String species;

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

    // Name Getter and Setter
    public String getName(){
        return name;
    }

    public void setName(String newName) {
        System.out.println(name + "'s name is now " + newName);
        name = newName;
    } // End of Name Getter and Setters

    // Age Getter and Setters
    public int getAge() { return age; }

    public void setAge(int newAge){
        age = newAge;
    } // End of Age Getter and Setters

    // Color Getter and Setter
    public String getColor() { return color; }

    public void setColor(String newColor){
        color = newColor;
    }

}  // End of Dog class

