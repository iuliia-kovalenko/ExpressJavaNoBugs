package practice_12.hw;

public class DebugTask4 {
    public static void main(String[] args) {
        try {
            System.out.println(isPalindrome(null));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
    public static boolean isPalindrome(String str) {
        if (str == null) {
            throw new IllegalArgumentException("String must not be null");
        }
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
