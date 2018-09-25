import java.util.ArrayList;

public class Library {

    ArrayList<Book> books;
    public int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int bookCount() {
       return this.books.size();
    }

    public void addBook(Book book) {
        if (this.bookCount() < this.capacity) {
            this.books.add(book);
        }
    }

}
