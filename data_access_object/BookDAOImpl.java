package DesignPattern.data_access_object;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/9 15:18
 */
public class BookDAOImpl implements BookDAO{
    //就当个数据库吧
    private List<Book> books;

    public BookDAOImpl() {
        this.books = new ArrayList<>();
        Book book1 = new Book(1, "高等数学", "牛顿", "123-ABC");
        Book book2 = new Book(2, "数据结构", "图灵", "456-QWE");
        Book book3 = new Book(3, "大学英语", "玛丽", "888-IOP");
        books.add(book1);
        books.add(book2);
        books.add(book3);
    }

    @Override
    public List<Book> getAllBooks() {
        return this.books;
    }

    @Override
    public Book getBook(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    @Override
    public void updateBook(Book book) {
        int id = book.getId();
        for (Book abook : books) {
            if (book.getId() == id) {
                abook = book;
            }
        }
    }

    @Override
    public void deleteBook(int id) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book abook = iterator.next();
            if (abook != null && abook.getId() == id) {
                iterator.remove();
            }
        }
    }
}
