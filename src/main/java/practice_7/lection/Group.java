package practice_7.lection;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Group implements Iterable<String> {
    private String[] students;

    public Group(String[] students) {
        this.students = students;
    }

    @Override
    public Iterator<String> iterator() {
        return new GroupIterator();
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<String> spliterator() {
        return Iterable.super.spliterator();
    }

    private class GroupIterator implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < students.length;
        }

        @Override
        public String next() {
            return students[index++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Delete is not supported");
        }
    }
}
