package Lessons;

public class Box {

    protected double width;
    protected double height;
    protected double depth;

    // This is an empty constructor
    Box() {

    } // end of Constructor #1

    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    } // end of Constructor #2

    void getVolume() {
        System.out.println("Volume is: " + width * height * depth);
    } // end of getVolume()
} // end of Box class
