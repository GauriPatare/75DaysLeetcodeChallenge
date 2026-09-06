class Solution {

    private double power(double x, long n) {
        if (n == 0) {
            return 1.0;
        }

        double half = power(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        }

        return x * half * half;
    }

    public double myPow(double x, int n) {
        long N = n;

        if (N < 0) {
            return 1.0 / power(x, -N);
        }

        return power(x, N);
    }
}

class Main {
    public static void main(String[] args) {

        Solution sol = new Solution();

        double x = 2.0;
        int n = 10;

        double result = sol.myPow(x, n);

        System.out.println(x + "^" + n + " = " + result);
    }
}

