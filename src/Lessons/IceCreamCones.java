package Lessons;

import org.w3c.dom.Text;

public class IceCreamCones {

    public static void main(String[] args){

        // read from our Icecream.dat file, set this to System.in
        TextIO.readFile("C:\\Users\\Admin\\Documents\\Github\\Java\\Lessons\\src\\Lessons\\icecream.dat");
        int iceCreams = 0;  // Ice Cream Count
        int strawberryIceCreams = 0;  // Strawberry Ice Cream Count
        double strawberryPercent;  // percentage of Ice Creams that are Strawberry

        String p = TextIO.getln(); // sets the string variable p equal to a line of our file


        while(p.equals(TextIO.eof()) != true){

            if(p.equals("Strawberry")){
                strawberryIceCreams += 1;
                iceCreams += 1;
            }
            else{
                iceCreams += 1;
            }
            if(TextIO.eof()){
                break;
            }
            p = TextIO.getln();
        } // end of while loop

        strawberryPercent = ( (double) strawberryIceCreams / iceCreams) * 100;

        System.out.println("There were a total of " + iceCreams + " sold.");
        System.out.println("There were a total of " + strawberryIceCreams + " strawberry ice creams sold");
        System.out.print("Strawberry ice creams accounted for ");
        System.out.printf("%1.2f", strawberryPercent);
        System.out.println(" percent.");

    }
}
