public class kthBitInNth {
    public static char findKthBit(int n, int k) {
        if (n == 1) return '0';  
            String sn = generateSn(n);
            return sn.charAt(k - 1);
        }
    public static String generateSn(int n) {
        if (n == 1) return "0";  
            String previous = generateSn(n - 1);
            String inverted = invert(previous);
            String reversed = new StringBuilder(inverted).reverse().toString();
            return previous + "1" + reversed;
}

    public static String invert(String s) {
        StringBuilder inverted = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (c == '0') inverted.append('1');
                else inverted.append('0');
        }
        return inverted.toString();
}
    public static void main(String[] args) {
        int n = 4;
        int k = 11;
        System.out.println(findKthBit(n, k)); 

    }
    
}
