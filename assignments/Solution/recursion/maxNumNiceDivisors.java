public class maxNumNiceDivisors {
    long mod = 1000000007;

    private long power(int b, int n) {
        if (n == 0) return 1;

        long ans = power(b, n / 2);
        if (n % 2 != 0) {
            return (ans * ans % mod * b) % mod;
        }
        return (ans * ans) % mod;
    }

    public int maxNiceDivisors(int primeFactors) {
        if (primeFactors == 1) return 1;

        int res = 0;
        if (primeFactors % 3 == 0) res = (int) power(3, primeFactors / 3);
        if (primeFactors % 3 == 1) res = (int) ((4 * power(3, primeFactors / 3 - 1)) % mod);
        if (primeFactors % 3 == 2) res = (int) ((2 * power(3, primeFactors / 3)) % mod);
        return res;
    }

    public static void main(String[] args) {
        int primeFactors = 5;
        System.out.println(new maxNumNiceDivisors().maxNiceDivisors(primeFactors));
    }
}
