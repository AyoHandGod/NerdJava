package Lessons;
import java.util.Scanner;

public class DecisionNode {

    private double bottomPayout;
    private ProbabilityNode probPayout;

    /**
     * DecisionNode Constructor
     */
    DecisionNode() {
        Scanner reader = new Scanner(System.in);  // Scanner to get values for tree
        System.out.println("Provide the payout value for no action: ");
        bottomPayout = reader.nextDouble();      // bottom payout value
        System.out.println("Please provide the probability of success: ");
        double successProb = reader.nextDouble();
        System.out.println("Please provide the payout for successful action: ");
        double successPayout = reader.nextDouble();
        System.out.println("Please provide the cost for being unsuccessful: ");
        double lossPayout = reader.nextDouble();

        if(lossPayout > 0){
            lossPayout *= -1;
        }
        probPayout = new ProbabilityNode(successProb, successPayout, lossPayout);
    } // end of DecisionNode()


    public double getBottomPayout() {
        return bottomPayout;
    } // end of getBottomPayout();

    public void setBottomPayout( double nPayout ){
        bottomPayout = nPayout;
    } // end of setBottomPayout();

    public double getProbPayout() {
        return probPayout.getValue();
    }  // end of getProbPayout();

    public boolean evaluate() {
        if(probPayout.getValue() > bottomPayout){
            return true;
        } else {
            return false;
        }
    } // end of evaluate()



    public static void main(String[] args){
        DecisionNode p = new DecisionNode();
        System.out.println(p.getBottomPayout());
        System.out.println(p.getProbPayout());
        System.out.println(p.evaluate());
    }

}
