package Lessons;
import java.util.Scanner;

public class Dice {

    private int sides;
    private int face;

    /**
     * Dice object constructor #1
     * @param sides : amount of sides dice has
     */
    Dice(int sides){
        this.sides = sides;
    }


    /**
     * Dice object constructor #2
     * @param sides : amount of sides dice has
     * @param face  ; set face value for dice
     */
    Dice(int sides, int face){
        this.sides = sides;
        this.face = face;
    }


    /**
     * sides instance variable Getter
     * @return : amount of sides of dice object
     */
    public int getSides(){
        return sides;
    }


    /**
     * Updates the amount of sides a dice object has
     * @param nSides : new amount of sides for dice object
     */
    public void setSides(int nSides){
        while(nSides % 2 != 0){   // check if sides are valid for dice.
            Scanner reader = new Scanner(System.in);  // Scanner that will be used to read updated input
            System.out.println("Sides must even. " +
                    "Please provide an even number");
            nSides = reader.nextInt();
        }
        sides = nSides;
    }


    /**
     *  Simulate Dice roll. Updates face value
     */
    public void roll(){
        face = (int)(Math.random()* sides) + 1;  // update face of dice using random
    }


    /**
     *
     * @param d1 : A dice object
     * @param d2 : Another dice object
     * @param trials : Amount of times to test rolls until snake eyes
     */
    public static void snakeAverage(Dice d1, Dice d2, int trials){
        int cTotal = 0;
        for (int i = 0; i < trials; i++) {
            int count = 0;

            // roll the dice, or the last successful snake eyes pair
            // will stick
            d1.roll();
            d2.roll();
            while (true) {
                if (d1.getFace() == 1 && d2.getFace() == 1) {
                    break;
                }
                d1.roll();
                d2.roll();
                count++;
            }
            System.out.println("Rolled " + count + " times before " +
                    "landing on snake eyes");
            cTotal += count;
        }
        double average = cTotal / trials;
        System.out.println("The average number of rolls before snake eyes " +
                "in " + trials + " rolls, is " + average);
    }


    /**
     *
     * @return : Dice objects face value. (Face: the side its landed on)
     */
    public int getFace() {
        return face;
    }


    public static void main(String[] args){

        // Create two new dice objects. Use both constructor types
        // just to test.
        Dice d1 = new Dice(6);
        Dice d2 = new Dice(6, 3);

        // Roll dice one to generate a face value for it
        d1.roll();

        // call our snakeAverage method using the two dice.
        snakeAverage(d1, d2, 5);
    }
}
