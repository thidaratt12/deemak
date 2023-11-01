package Int101w8;

public final class MyUtil {
    private MyUtil() {
    }

    public static int factorial(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i == 0) {
            return 1;
        }
        int result = 1;
        for (; i > 0; --i) {
            result *= i;
        }
        return result;
    }

    public static int summation(final int i, final int j) {
        int sum = 0;
        int min = i < j ? i : j;
        int max = i < j ? j : i;
        for (; min <= max; min++) {
            sum += min;
        }
        return sum;
    }

    public static int fibonacci(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Fibonacci squence starts from 0");
        }
        if (i < 2) {
            return i;
        }
        return fibonacci(i - 2) + fibonacci(i - 1);

    }
}

