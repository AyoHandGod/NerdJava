package Lessons;

public class Interest {

    public static void main(String[] args){
        double principal;   // The value of the investment.
        double rate;        // The annual interest rate.

        /* Get the initial investment and interest rate from the user. */

        System.out.print("Enter the initial investment: ");
        principal = TextIO.getlnDouble();

        System.out.println();
        System.out.println("Enter the annual interest rate");
        System.out.print("Enter a decimal, not a percentage: ");
        rate = TextIO.getlnDouble();
        System.out.println();

        /* Simulate the investment for 5 years */

        int years = 0;
        while(years < 5) {
            double interest; // Interest for this year
            interest = principal * rate;
            principal = principal + interest;
            years++;
            System.out.print("The value of the investment after "
            + years + " years is $");
            System.out.printf("%1.2f", principal);
            System.out.println();
        } // end of while loop

    }  // end of main()

}  // end of class Interest
