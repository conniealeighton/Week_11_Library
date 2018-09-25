import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before() {
        book = new Book("Philip Pullman", "Northern Lights", "Fantasy");
    }

    @Test
    public void bookHasAuthor() {
        assertEquals("Philip Pullman", book.author);
    }

    @Test
    public void bookHasTitle() {
        assertEquals("Northern Lights", book.title);
    }

    @Test
    public void bookHasGenre() {
        assertEquals("Fantasy", book.genre);
    }
}
