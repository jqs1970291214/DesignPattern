package DesignPattern.iterator;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/4 15:51
 */
public class Test {
    public static void main(String[] args) {
        BookContainer bookContainer = new BookContainer();
        Iterator iterator = bookContainer.getIterator();
        while (iterator.hasNext()) {
            System.out.println("Book: " + iterator.next());
        }
        iterator.reset();
        System.out.println("After sort");
        bookContainer.sort();
        while (iterator.hasNext()) {
            System.out.println("Book: " + iterator.next());
        }
    }
}
