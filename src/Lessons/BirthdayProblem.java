package Lessons;

public class BirthdayProblem {

    public static void main(String[] args){
        boolean[] used = new boolean[365];  // For recording the possible birthdays
                                            // that have been seen so far. A value
                                            // of true in used[i] means that a person
                                            // whose birthday is the i-th day of the
                                            // year has been found.

        int count = 0;                      // The number of people who have been checked.

        while (true) {
            // Select a bday at random, from 0 to 364.
            // If the bday has already been used, quit.
            // Otherwise, record the birthday as used.

            int birthday = (int)(Math.random()*365);
            count++;

            System.out.printf("Person %d has birthday number %d", count, birthday);
            System.out.println();

            if (used[birthday]) {
                // This day was found; it's a duplicate. We are done.
                break;
            }

            used[birthday] = true;

        }   // end while

        System.out.println();
        System.out.println("A duplicate birthday was found after "
                        + count + " tries.");

    } // end class BirthdayProblem
}
