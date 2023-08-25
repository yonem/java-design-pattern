package jp.ne.yonem.pattern.Iterator.Sample;

public class Main {

    public static void main(String[] args) {
        var bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));

        for (Iterator it = bookShelf.iterator(); it.hasNext(); ) {
            var book = (Book) it.next();
            System.out.println(book.name());

            if (!it.hasNext()) {
                System.out.println("=-=-=-=-=- End =-=-=-=-=-=-");
            }
        }
    }
}
