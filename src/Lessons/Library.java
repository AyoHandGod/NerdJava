package Lessons;

public class Library {
    private Book[] collection;
    private String address;
    public static String hours = "Libraries are open daily from 9am to 5p";
    public static String[] addresses = new String[30];
    private int addressIndexer;
    private int bookIndex;

    public Library(String address){
        this.address = address;
        addresses[addressIndexer] = address;
        addressIndexer += 1;
        collection = new Book[50];
    }

    public void addBook(Book title){
        if(bookIndex < 50) {
            collection[bookIndex] = title;
            bookIndex += 1;
        } else {
            System.out.println("Library is full at this time");
        }
    }

    public Book[] getCollection() {
        return collection;
    }

}
