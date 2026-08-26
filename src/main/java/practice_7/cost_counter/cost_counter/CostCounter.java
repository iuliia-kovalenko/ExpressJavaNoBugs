package practice_7.cost_counter.cost_counter;

import java.util.ArrayList;

public class CostCounter {
    //массив, индекс равен месяцу
    private ArrayList<Double> costsPerMonth;
    // метод получения расхода по месяцу

    public CostCounter() {
        this.costsPerMonth = new ArrayList<>();
    }

    public void addCosts(int month, Double costs) {
        costsPerMonth.add(month, costs);
    }

    public Double getCosts(int month) {
        return costsPerMonth.get(month);
    }

    // считать месяц с минимальным расходом
    public double getMinCostMonth() {
        double min = costsPerMonth.get(0);
        for (Double costPerMonth : costsPerMonth) {
            if (costPerMonth < min) {
                min = costPerMonth;
            }
        }
        return min;
    }


}

