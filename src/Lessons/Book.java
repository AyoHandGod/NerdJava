package Lessons;

public class Book {

    private String title;
    private boolean borrowed;

    //Creates the new Book
    public Book(String bookTitle){
        title = bookTitle;
    }

    public void borrowed() {
        borrowed = true;
    }

    public void returned() {
        borrowed = false;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public String getTitle() {
        return title;
    }

    public static void main(String[] args){
        // minor test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code" + example.getTitle());
        System.out.println("Borrowed?: " + example.isBorrowed());
        example.borrowed();
        System.out.println("Borrowed?: " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed?: " + example.isBorrowed());
    }  // end of main()
}
