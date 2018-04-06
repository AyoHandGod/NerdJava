package Lessons;

import java.util.Scanner;

public class Main {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args){
        while(true) {
            System.out.println("Please enter your pay rate:  ");
            double payRate = reader.nextDouble();
            System.out.println("Please enter the amount of hours worked: ");
            int hourWorked = reader.nextInt();
            System.out.println(Pay.calc(payRate, hourWorked));
            System.out.println("Are you done?");
            String status = reader.next();
            if(status.equalsIgnoreCase("yes")){
                break;
            }
            // N3.n3(numero);
            // Gravity.gravFall();
        }
    }

}
