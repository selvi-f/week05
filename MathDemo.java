package week05;

public class MathDemo {
    public static int min(int a, int b) {
        return Math.min(a, b);
    }
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int sum(int[] args) {
        int total = 0;
        for (int num : args) {
            total += num;
        }
        return total;
    }

    public static float mean(int[] args) {
        int sum = sum(args);
        return (float) sum / args.length;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

// you can call directly without creating an instance in the static method

