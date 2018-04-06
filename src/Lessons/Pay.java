package Lessons;

public class Pay {

    public static double calc(double baseP, int work_hours) {
        double ot_payrate = baseP * 1.5;    // Overtime payrate
        double otPay = 0.0;                 // Earned overtime pay

        if(baseP < 8.0){
            System.out.println("Pay rate is beneath state minimum");
            throw new NumberFormatException();
        }

        if(work_hours > 40) {
            int ot_hours = work_hours - 40;
            work_hours = 40;
            if(ot_hours > 20) {
                ot_hours = 20;
            }
            otPay = ot_hours * ot_payrate;
        }

        double normRate = baseP * work_hours;
        double total_p = normRate + otPay;
        return total_p;
    }
}
