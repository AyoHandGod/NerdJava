package Lessons;

public class Firstsubroutines {

    /**
     * Reverses String
     * @param flipWord - String to be reversed
     * @return - reversed string
     */
    static String reverse(String flipWord){
        String reverse = "";
        int i;
        for (i = flipWord.length() - 1; i >= 0; i--) {
            reverse = reverse + flipWord.charAt(i);
        }
        return reverse;
    }  // end of reverse()

    /**
     * Strips string of non-alphabetical chars
     * @param stripWord - String to be stripped
     * @return - String stripped of non-alphabets
     */
    static String stripped(String stripWord) {
        String strippedWord = "";
        int i;
        for (i = 0; i < stripWord.length(); i++){
            if(Character.isLetter(stripWord.charAt(i))){
                strippedWord = strippedWord + stripWord.charAt(i);
            }
        }
        return strippedWord;
    }  // end of stripped()

    public static void main(String[] args) {

        String reader = TextIO.getlnString();  // get user input
        reader = reader.toLowerCase();         // convert it to lowercase
        String copy = reader;                  // create a copy for later use

        System.out.print("stripped: ");
        reader = stripped(reader);
        System.out.println(reader);
        System.out.println();

        System.out.print("reversed: ");
        reader = reverse(reader);
        System.out.println(reader);
        System.out.println();

        if(reader.equals(stripped(copy))){
            System.out.println("This IS a palindrome");
        } else {
            System.out.println("This is NOT a palindrome.");
        }

    } // end of main()
}
