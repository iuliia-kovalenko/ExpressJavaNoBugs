package practice_12.hw;

public class DebugTask4 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(null));
        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome("Palindrom"));
    }

    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
