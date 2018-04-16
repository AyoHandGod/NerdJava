package Lessons;

public class ProbabilityNode {
    private double winProbability;
    private double loseProbability;
    private double winPayout;
    private double losePayout;
    private double value;

    public ProbabilityNode(double winProbability,
                    double winPayout, double losePayout){
        this.winProbability = winProbability / 100;
        this.winPayout = winPayout;
        this.losePayout = losePayout;
        loseProbability = (100 - winProbability) / 100;
        value = (this.winPayout * this.winProbability) +
                (this.loseProbability * this.losePayout);
    }

    public double getValue() {
        return value;
    }

    public static void main(String[] args){
        ProbabilityNode p = new ProbabilityNode(10,500,-25);
        System.out.println(p.getValue());
    }
}
