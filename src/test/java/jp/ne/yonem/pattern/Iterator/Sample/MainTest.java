package jp.ne.yonem.pattern.Iterator.Sample;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("Iterator")
    void test1() {
        var bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));

        for (var it = bookShelf.iterator(); it.hasNext(); ) {
            var book = it.next();
            System.out.println(book.name());

            if (!it.hasNext()) {
                System.out.println("=-=-=-=-=- End =-=-=-=-=-=-");
            }
        }
    }
}