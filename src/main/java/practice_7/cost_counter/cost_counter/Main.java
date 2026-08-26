package practice_7.cost_counter.cost_counter;

public class Main {
    public static void main(String[] args) {
        CostCounter costCounter = new CostCounter();
        costCounter.addCosts(0, 123.0);
        costCounter.addCosts(1, 555.98);
        costCounter.addCosts(2, 777.0);
        costCounter.addCosts(3, 888.0);

        System.out.println(costCounter.getCosts(3));
        System.out.println(costCounter.getMinCostMonth());
    }
}
