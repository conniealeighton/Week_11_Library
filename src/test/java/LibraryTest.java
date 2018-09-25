import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;


public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before() {

        library = new Library(3);


    }

    @Test
    public void getLibraryBookCount() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook() {
            library.addBook(book);
            assertEquals(1, library.bookCount());

    }

    @Test
    public void hasCapacityThree() {
        assertEquals(3, library.capacity);
    }

    @Test
    public void goesOverCapacity() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.bookCount());
    }
}
