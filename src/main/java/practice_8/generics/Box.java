package practice_8.generics;

public class Box<T> {
    private T element;

    public void setElement(T el) {
        this.element = el;
    }

    public T getElement() {
        return this.element;
    }
}
