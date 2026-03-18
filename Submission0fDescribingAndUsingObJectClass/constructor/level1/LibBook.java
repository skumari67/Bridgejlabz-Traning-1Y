package constructor.level1;

public class LibBook {
    

    String title, author;
    double price;
    boolean available = true;

    void borrow() {
        if (available) {
            available = false;
            System.out.println("Book Borrowed");
        } else {
            System.out.println("Not Available");
        }
    }
}