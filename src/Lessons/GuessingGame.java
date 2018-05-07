package Lessons;

public class GuessingGame {

    static void playGame() {
        int computersNumber; // A random number picked by the computer
        int usersGuess;      // A number entered by the player as a guess
        int guessCount;      // Number of guesses the user has made

        computersNumber = (int)(Math.random() * 100) + 1;
        guessCount = 0;

        System.out.println();
        System.out.println("What's your first guess?");
        while(true) {
            usersGuess = TextIO.getInt();
            guessCount++;
            if(usersGuess == computersNumber){
                System.out.println("You got it in " + guessCount
                + " guesses! My number was " + computersNumber);
                break; // The game is over; Player wins.
            }
            if (guessCount == 6){
                System.out.println("You didn't get the number in 6 guesses.");
                System.out.println("You lose. My number was " + computersNumber);
                break;  // The game is over. Player losses.
            }
            if(usersGuess < computersNumber){
                System.out.println("That's too low. Try again: ");
            } else if (usersGuess > computersNumber) {
                System.out.println("That's too high. Try again: ");
            }
            System.out.println();
        }
    } // end of playGame()

    public static void main(String[] args){
        System.out.println("Let's play a game. I'll pick a number between");
        System.out.println("1 and 100, and you try to guess it.");
        boolean playAgain;
        do {
            playGame();
            System.out.println("Would you like to play again?");
            playAgain = TextIO.getlnBoolean();
        } while(playAgain);
        System.out.println("Thanks for playing.  Goodbye!");
    } // end of main()
}
