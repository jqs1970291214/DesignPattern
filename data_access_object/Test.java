package DesignPattern.data_access_object;

import java.util.Arrays;
import java.util.List;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/9 15:25
 */
public class Test {
    public static void main(String[] args) {
        BookDAO bookDAO = new BookDAOImpl();
        printBook(bookDAO.getAllBooks());
        System.out.println("******");
        printBook(Arrays.asList(bookDAO.getBook(1)));

        bookDAO.deleteBook(2);
       System.out.println("******");
       printBook(bookDAO.getAllBooks());

        Book abook = bookDAO.getBook(1);
        abook.setName("经典物理");
        bookDAO.updateBook(abook);
        System.out.println("******");
        printBook(bookDAO.getAllBooks());
    }

    public static void printBook(List<Book> books) {
        for (Book book : books) {
            System.out.println(book.getId() + " " + book.getName() + " " + book.getAuthor());
        }
    }
}
