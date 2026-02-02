class MyMath {
    static long custom_factorial(int n) {
        if (n == 0) return 1L;
        long result = 1L;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
