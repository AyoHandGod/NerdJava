package Lessons;

public class N3 {

    public static int n3(int number) {

        int count = 0;// count of cycles
        String lines = "The line count for this cycle is: ";
        while(number != 1) {
            if(number % 2 == 0) {
                number = number / 2;
            } else {
                number = number * 3 + 1;
            }
            System.out.println(number);
            System.out.println(lines + count);
            count++;
        }
        return count;
    }

}
