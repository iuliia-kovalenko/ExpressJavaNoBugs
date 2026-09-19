package practice_8.hw.additional_tasks;

public class Storage<T> {
    private T item;

    void setItem(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }
}