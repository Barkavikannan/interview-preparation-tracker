public class permutationSequence {
    public static String getPermutation(int n, int k) {
        boolean[] used = new boolean[n];
        return FindKthPermutation(n, k, used);
    }

    static String FindKthPermutation(int n, int k, boolean[] used) {
        if (n == 1) {
            for (int i = 0; i < used.length; i++) {
                if (!used[i]) {
                    return "" + (i + 1);
                }
            }
        }
        
        int factn = fact(n - 1);
        int seg = (k - 1) / factn;
        int cur = 0;

        for (int i = 0; i < used.length; i++) {
            if (used[i]) {
                continue;
            }
            if (seg == 0) {
                used[i] = true;
                cur = i;
                break;
            }
            seg--;
        }

        return (cur + 1) + FindKthPermutation(n - 1, k - (factn * (k - 1) / factn), used);
    }

    static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        int n = 3;
        int k = 3;
        System.out.println(permutationSequence.getPermutation(n, k));
    }
}
