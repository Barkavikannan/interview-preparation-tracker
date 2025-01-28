public class basicCalculator {
    public static int calculate(String s) {
        if (s.length() == 0) return 0;
        s = "(" + s + ")";
        int[] p = {0};
        return eval(s, p);
    }

    private static int eval(String s, int[] p) {
        int val = 0;
        int i = p[0];
        int oper = 1; // 1 for +, -1 for -
        int num = 0;

        while (i < s.length()) {
            char c = s.charAt(i);
            switch (c) {
                case '+':
                    val = val + oper * num;
                    num = 0;
                    oper = 1;
                    i++;
                    break;
                case '-':
                    val = val + oper * num;
                    num = 0;
                    oper = -1;
                    i++;
                    break;
                case '(':
                    p[0] = i + 1;
                    val = val + oper * eval(s, p);
                    i = p[0];
                    break;
                case ')':
                    p[0] = i + 1;
                    return val + oper * num;
                case ' ':
                    i++;
                    continue;
                default:
                    num = num * 10 + (c - '0');
                    i++;
            }
        }

        return val;
    }

    public static void main(String[] args) {
        String s = "1+1";
        System.out.println(calculate(s)); // Output: 2
    }
}
