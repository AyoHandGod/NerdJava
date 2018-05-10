package Lessons;

/**
 * This program opens a window full of randomly colored squares. A "Disturbance"
 * move randomaly around in the window, randomly changing the color of each
 * square that it visits. The program runs until the user closes the window.
 */
public class RandomMosaicWalk {

    static int currentRow;   // Row currently containing the disturbance.
    static int currentColumn; // Column currently containing the disturbance.

    /**
     * The main program creates the window, fills it with random colors,
     * and then moves the disturbance in a random walk around the window
     * as long as the window is open.
     */
    public static void main(String[] args){
        Mosaic.open(16,20,25,25);
        fillWithRandomColors();
        currentRow = 8;   // start at center of window
        currentColumn = 10;

        while (Mosaic.isOpen()) {
            changeToRandomColor(currentRow, currentColumn);
            randomMove();
            Mosaic.delay(1);
        }
    } // end main()

    static void fillWithRandomColors() {

    } // end fillWithRandomColors()

    static void changeToRandomColor(int rowNum, int colNum){

    } // end changeToRandomColor()

    static void randomMove() {

    } // end randomMove()
    
}  // end class RandomMosaicWalk
