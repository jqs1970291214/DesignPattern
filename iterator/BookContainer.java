package DesignPattern.iterator;

import java.util.Arrays;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/4 15:47
 */
public class BookContainer implements Container{
    private String[] books = {"JAVA核心技术", "大学英语", "高等数学", "MIS", "移动设备开发"};

    @Override
    public Iterator getIterator() {
        return new BookInterator();
    }

    public void sort() {
        Arrays.sort(books);
    }

    private class BookInterator implements Iterator {
        int index = 0;
        @Override
        public boolean hasNext() {
            if (index < books.length) return true;
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) return books[index++];
            return null;
        }

        public void reset() {
            index = 0;
        }
    }
}
