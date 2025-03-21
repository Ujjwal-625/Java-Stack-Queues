import java.util.*;

public class StockSpan {
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n]; // Array to store the span of each day
        Stack<Integer> stack = new Stack<>(); // Stack to store indices of days

        for (int i = 0; i < n; i++) {
            // Pop elements from stack while stack is not empty and stack's top price is less than or equal to current price
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If stack is empty, it means all previous prices are smaller, so span is (i + 1)
            span[i] = (stack.isEmpty()) ? (i + 1) : (i - stack.peek());

            // Push current index onto stack
            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] span = calculateSpan(prices);

        System.out.println("Stock Span: " + Arrays.toString(span));
    }
}
