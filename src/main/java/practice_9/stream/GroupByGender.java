package practice_9.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByGender {
    public static void main(String[] args) {
        List<String> names = List.of("John:M", "Sarah:F");
        Map<String, List<String>> groupedByGender = names.stream()
                .collect(Collectors.groupingBy(name -> name.split(":")[1],
                        Collectors.mapping(name -> name.split(":")[0],
                                Collectors.toList())));
        System.out.println(groupedByGender);

    }
}
