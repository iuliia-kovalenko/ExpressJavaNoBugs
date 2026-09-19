package practice_8.exceptions.unchecked;

public class IndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        try {
            int[] nums = {1, 2, 3};
            int number = nums[5];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Trying to access array index out of array.");
        }
    }
}
