package Lessons;

public class Puppy extends Dog {

    @Override
    public void bark(){
        System.out.println("A tiny woof erupts!");
    }

    public static void main(String[] args){
        Puppy test = new Puppy();
        test.age = 1;
        test.bark();
        System.out.println(test.getAge());
    }
}
