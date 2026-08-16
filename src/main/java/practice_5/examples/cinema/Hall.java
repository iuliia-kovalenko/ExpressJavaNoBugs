package practice_5.examples.cinema;

import java.util.ArrayList;
import java.util.List;

public class Hall {
    private String name;
    private List<Row> rows = new ArrayList<>();

    public Hall(String name) {
        this.name = name;
    }

    public void addRow(Row row) {
        rows.add(row);
    }

    public String getName() {
        return name;
    }

    public List<Row> getRows() {
        return rows;
    }
}
