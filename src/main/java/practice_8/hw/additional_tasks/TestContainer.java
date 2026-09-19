package practice_8.hw.additional_tasks;

public class TestContainer<T> implements Container<T>{
    private T item;

    @Override
    public void add(T item) {
        this.item = item;
    }

    @Override
    public T get() {
        return item;
    }
}
