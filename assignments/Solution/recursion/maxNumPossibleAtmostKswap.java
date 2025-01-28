
public class maxNumPossibleAtmostKswap {
      static String findMax(String s, int k) {
        
        if (k == 0) {
            return s;
        }

        int n = s.length();
        String ans = s;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                if (s.charAt(i) < s.charAt(j)) {

                    s = swap(s, i, j);

                    String recResult = findMax(s, k - 1);
                    if (recResult.compareTo(ans) > 0) {
                        ans = recResult;
                    }
                    s = swap(s, i, j);
                }
            }
        }

        return ans;
    }

    static String findMaximumNum(String s, int k) {

        return findMax(s, k);
    }

    static String swap(String s, int i, int j) {

        char[] arr = s.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return new String(arr);
    }

    public static void main(String[] args) {
      
        String s = "7599";
        int k = 2;

        System.out.println(findMaximumNum(s, k));
    }
}
