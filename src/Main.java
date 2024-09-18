import ABCD.LibraryCatalogue.Book;
import Others.ReverseString;

import java.util.HashMap;
import java.util.Map;

public class Main {

        //Book Catalogue (Properties, Fields, Global Variables)
        Map<String, Book> bookCollection = new HashMap<String, Book>();
        int currentDay = 0;
        int lengthOfCheckOutPeriod = 0;
        double initialLateFee = 0.50;
        double feePerLateDay = 1.00;    //Additional day you dont return the book




        //Constructors for Library Catalogue
        public Main(Map<String, Book> collection) {
            this.bookCollection = collection;
        }
        public Main(Map<String, Book> collection, int lengthOfCheckOutPeriod,
                    double initialLateFee, double feePerLateDay) {
            this.bookCollection = collection;
            this.lengthOfCheckOutPeriod = lengthOfCheckOutPeriod;
            this.initialLateFee = initialLateFee;
            this.feePerLateDay = feePerLateDay;
        }



        //Getters
    public int getCurrentDay() {
        return this.currentDay;
    }
    public Map<String, Book> getBookCollection() {
            return this.bookCollection;
    }
    public Book getBook(String bookTitle) {
        return getBookCollection().get(bookTitle);
    }
    public int getLengthOfCheckOutPeriod(){
            return this.lengthOfCheckOutPeriod;
    }
    public double getInitialLateFee() {
        return this.initialLateFee;
    }

    public double getFeePerLateDay() {
        return this.feePerLateDay;
    }

    //Setters
    public void nextDay() {
       currentDay++;
    }
    public void setDay(int day) {
        currentDay = day;
    }


    //Instance Methods
    public void checkoutBook(String title) {
        Book book = getBook(title);     //Datatype Book
        if (book.getIsCheckedOut()){
            sorryBookAlreadyCheckedOut(book);
        } else {
            book.setCheckedOut(true, currentDay);
            System.out.println("You just checked out "+ title + ", It is due on Date: " +
                    (getCurrentDay() + getLengthOfCheckOutPeriod()) );
        }
    }
    public void returnBook(String title) {
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckOutPeriod());
        if (daysLate > 0) {
            System.out.println("You owe the Library $" + (getInitialLateFee() + daysLate * getFeePerLateDay()) +
                    " because your Book is " + daysLate + " Days overdue.");
        } else {
            System.out.println("Book Returned, Thank You!!");
        }
        //Now that its returned, change the Book so that its not checked out anymore
        book.setCheckedOut(false, -1);
    }
    public void sorryBookAlreadyCheckedOut(Book book) {
        System.out.println("Sorry, " + book.getTitle() + " is already checked out, " +
                "It should be back on day " + (book.getDayCheckedOut() + getLengthOfCheckOutPeriod())+".");
    }



    public static void main(String[] args) {

        // Create our Books
        Map<String, Book> bookCollection  = new HashMap<String, Book>();
        Book b1 = new Book("Harry Potter", 100, 99999);

        bookCollection.put("Harry Potter", b1);

        // Initialize our Library Catalogue with checkout period of 7 days,
        // initial late fee of $0.50, and $1.00 fee per late day
        Main lib = new Main(bookCollection, 7, 0.50, 1.00);

        // Simulate the checkout and return process
        lib.checkoutBook("Harry Potter");  // Checkout book
        lib.nextDay();                     // Increment day
        lib.nextDay();                     // Increment day
        lib.checkoutBook("Harry Potter");  // Try to checkout again (should give an error)
        lib.setDay(17);                    // Set the day to 17
        lib.returnBook("Harry Potter");    // Return book (should calculate late fee)
        lib.checkoutBook("Harry Potter");  // Checkout the book again



      // Create an instance of Others.ReverseString and call the method to reverse the string
      // ReverseString reverseString = new ReverseString();
      // String reversed = reverseString.reverse("hello");
      //  System.out.println("Reversed string: " + reversed);
    }
}
