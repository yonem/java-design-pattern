package jp.ne.yonem.pattern.Iterator.Sample;

public class BookShelfIterator implements Iterator {
    private final BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    public Book next() {
        var book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
