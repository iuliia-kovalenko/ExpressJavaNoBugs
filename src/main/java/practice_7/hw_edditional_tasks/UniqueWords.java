package practice_7.hw_edditional_tasks;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueWords {
    public static void main(String[] args) {
        HashSet<String> uniqueWords = new HashSet<>();
        String text = "Let's check check how many unique words are in this this sentence 123 123";
        String[] words = text.split(" ");
        System.out.println(Arrays.toString(words));
        uniqueWords.addAll(Arrays.asList(words));
        System.out.println(uniqueWords);
        System.out.println(uniqueWords.size());
    }
}
