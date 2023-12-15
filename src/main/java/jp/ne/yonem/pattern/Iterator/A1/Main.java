package jp.ne.yonem.pattern.Iterator.A1;

public class Main {

    public static void main(String[] args) {
        var bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        bookShelf.appendBook(new Book("East of Eden"));
        bookShelf.appendBook(new Book("Frankenstein"));
        bookShelf.appendBook(new Book("Gulliver's Travels"));
        bookShelf.appendBook(new Book("Hamlet"));

        for (var it = bookShelf.iterator(); it.hasNext(); ) {
            var book = it.next();
            System.out.println(book.name());
        }
    }
}
