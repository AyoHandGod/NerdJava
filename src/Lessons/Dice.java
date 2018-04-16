package Lessons;
import java.util.Scanner;

public class Dice {

    private int sides;
    private int face;

    Dice(int sides){
        this.sides = sides;
    }

    Dice(int sides, int face){
        this.sides = sides;
        this.face = face;
    }

    public int getSides(){
        return sides;
    }

    public void setSides(int nSides){
        while(nSides % 2 != 0){   // check if sides are valid for dice.
            Scanner reader = new Scanner(System.in);  // Scanner that will be used to read updated input
            System.out.println("Sides must even. " +
                    "Please provide an even number");
            nSides = reader.nextInt();
        }
        sides = nSides;
    }

    public void roll(){
        face = (int)(Math.random()* sides) + 1;  // update face of dice using random
    }

    public int getFace() {
        return face;
    }

    public static void main(String[] args){
        Dice d1 = new Dice(6,1);
        Dice[] dl = new Dice[4];  // array pointer to array of Dice

        for(Dice element: dl){
            element = new Dice(6); // initialize a dice object pointer in each array index
            element.setSides(5);
            element.roll();
            System.out.println(element.getSides());
            System.out.println(element.getFace());
        }
    }
}
