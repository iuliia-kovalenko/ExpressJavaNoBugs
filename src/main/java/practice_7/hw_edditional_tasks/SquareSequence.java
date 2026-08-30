package practice_7.hw_edditional_tasks;

import java.util.ArrayDeque;

public class SquareSequence {
    private ArrayDeque<Character> stack;

    public SquareSequence() {
        this.stack = new ArrayDeque<>();
    }

    public void clearStack() {
        stack.clear();
    }

    public boolean isValid(String str) {
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if ((c == ')' || c == ']' || c == '}')) {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        SquareSequence squareSequence = new SquareSequence();
        System.out.println(squareSequence.isValid("{{{"));
        squareSequence.clearStack();
        System.out.println(squareSequence.isValid("{{{}"));
        squareSequence.clearStack();
        System.out.println(squareSequence.isValid("{{{}}}"));
    }
}
