package Lessons;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Library {

    protected ArrayList<Book> collection = new ArrayList<Book>();   // Library Book Collection
    protected ArrayList<Book> borrowedBooks = new ArrayList<Book>();  // List of Currently Borrowed Books
    ListIterator collectionLister = collection.listIterator();
    ListIterator borrowedLister = borrowedBooks.listIterator();

    protected String address;   // Library Address
    public static ArrayList<String> libraryAddresses = new ArrayList<String>();  // List of all Library Addresses
    public static String hours = "Libraries are open daily from 9am to 5pm.";    // Library Hours

    public Library (String address){
        this.address = address;
        libraryAddresses.add(this.address);
    } // end of Library Constructor

    public String getAddress() {
        return address;
    }  // return library address


    public static void listLibraries() {
        for (String address: libraryAddresses){
            System.out.println(address);
        }
    }  // end of listLibraries()


    public static void getHours() {
        System.out.println("Library hours: ");
        System.out.println(hours);
    }  // end of getHours()

    public void addBook(Book title){
        collection.add(title);
    }

    public void borrowBook(String title){
        for(Book book: collection){
            if(title.toLowerCase().equals(book.getTitle().toLowerCase()) && !book.isBorrowed()){
                System.out.println(title + " is now yours.");
                book.borrowed();
                break;
            }
        }

        System.out.println("Book currently unavailable.");
    }  // end of borrowBook()



    public static void main(String[] args){



        // Create Two Libraries
        Library lib1 = new Library("10 Main Street");
        Library lib2 = new Library("228 Liberty St.");


        // Add Four Books to the First Library
        lib1.addBook(new Book("The Da Vinci Code"));
        lib1.addBook(new Book("Le Petit Prince"));
        lib1.addBook(new Book("A Tale of Two Cities"));
        lib1.addBook(new Book("The Lord of the Rings"));

        // Print Opening hours and the addresses
        getHours();
        listLibraries();

        // Try to borrow The Lords of the Rings from both Libraries
        lib1.borrowBook("The Lord of the Rings");


        // Print the titles of all available books from both libraries
        listLibraries();


        // Return the Lords of the Rings to the first library



        // Print the titles of the available from the first library



    } // end of main()
} // end of Library class
