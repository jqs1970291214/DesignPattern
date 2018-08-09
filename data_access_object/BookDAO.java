package DesignPattern.data_access_object;

import java.util.List;

/**
 * DAO Interface
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/9 15:17
 */
public interface BookDAO {
    List<Book> getAllBooks();

    Book getBook(int id);

    void updateBook(Book book);

    void deleteBook(int id);

}
