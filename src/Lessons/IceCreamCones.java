package Lessons;

import org.w3c.dom.Text;

public class IceCreamCones {

    public static void main(String[] args){

        TextIO.readFile("C:\\Users\\Admin\\Documents\\Github\\Java\\Lessons\\src\\Lessons\\icecream.dat");
        int iceCreams = 0;
        int strawberryIceCreams = 0;
        double strawberryPercent = 0;

        String p = TextIO.getln();

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
        }

        strawberryPercent = ( (double) strawberryIceCreams / iceCreams) * 100;

        System.out.println("There were a total of " + iceCreams + " sold.");
        System.out.println("There were a total of " + strawberryIceCreams + " strawberry ice creams sold");
        System.out.println("Strawberry ice creams accounted for " + strawberryPercent + " percent.");

    }
}
