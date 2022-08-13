package Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("123"));
        bookShelf.appendBook(new Book("234"));
        bookShelf.appendBook(new Book("345"));
        bookShelf.appendBook(new Book("456"));
        bookShelf.appendBook(new Book("567"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()){
            Book book = (Book)iterator.next();
            System.out.println(book.getName());
        }
    }
}
