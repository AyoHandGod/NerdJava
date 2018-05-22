package Lessons;

public class MatchBox extends Box {
    protected double weight;
    protected final double WATERWEIGHT = .03611;

    MatchBox(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    void getVolume() {
        System.out.println("width of MatchBox is " + width);
        System.out.println("height of MatchBox is " + height);
        System.out.println("depth of MatchBox is " + depth);
        System.out.println("weight of MatchBox is " + weight);
        System.out.println("Volume is: " + width * height * depth);
    }

    void calculateWeight() {
        weight = width * height * depth * WATERWEIGHT;
    }

    public static void main(String[] args){
        MatchBox example = new MatchBox(5, 10, 3);
        example.calculateWeight();
        example.getVolume();
    }
}
