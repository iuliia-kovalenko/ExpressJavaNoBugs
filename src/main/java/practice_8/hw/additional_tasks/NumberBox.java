package practice_8.hw.additional_tasks;

import java.util.ArrayList;
import java.util.List;

public class NumberBox<T extends Number> {
    private List<T> list;

    public NumberBox() {
        this.list = new ArrayList<>();
    }

    public double getSum() {
        double sum = 0.0;
        for (T el: list) {
            sum += el.doubleValue();
        }
        return sum;
    }

    public void addItem(T el) {
        list.add(el);
    }
}