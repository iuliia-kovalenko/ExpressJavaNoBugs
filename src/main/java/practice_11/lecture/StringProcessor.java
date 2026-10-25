package practice_11.lecture;

public class StringProcessor {
    /**
     * Метод для проверки, является ли строка палиндромом
     * Примеры:
     *   - "abba" -> true
     *   - "bba" -> false
     */
    public boolean isPalindrome(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    public String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return new StringBuilder(input).reverse().toString();
    }

    public String validateLength(String input, int minLength) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        if (input.length() < minLength) {
            throw new IllegalArgumentException("Input must be at least " + minLength);
        }
        return input;
    }
}