package counting;

public class Summer {
    /**
     * Returns the sum of all the numbers from a to b (both inclusive).
     */
    public static int sumResult(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }
}
