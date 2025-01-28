public class parsingBooleanExpression {
    static int i; 

    public static boolean recc(String str) {
        if (str.charAt(i) == '|') { 
            boolean res = false;
            i++;
            while (str.charAt(i) != ')') {
                char ck = str.charAt(i);
                if (ck == 't') { 
                    res = true;
                    i++;
                } else if (ck == 'f' || ck == ',' || ck == '(') {
                    i++; 
                } else {
                    res |= recc(str); 
                }
                if (i >= str.length()) return res;
            }
            i++;
            return res;
        } else if (str.charAt(i) == '&') { 
            boolean res = true;
            i++;
            while (str.charAt(i) != ')') {
                char ck = str.charAt(i);
                if (ck == 'f') { 
                    res = false;
                    i++;
                } else if (ck == 't' || ck == ',' || ck == '(') {
                    i++; 
                } else {
                    res &= recc(str); 
                }
                if (i >= str.length()) return res;
            }
            i++;
            return res;
        } else if (str.charAt(i) == '!') { 
            i += 2; 
            char ck = str.charAt(i);
            i += 2; 
            if (ck == 'f') return true; 
            else if (ck == 't') return false; 
            i -= 2; 
            boolean res = !recc(str); 
            i++;
            return res;
        }

        return false;
    }

    public static boolean parseBoolExpr(String expression) {
        if (expression.equals("f")) return false; 
        else if (expression.equals("t")) return true; 
        i = 0; 
        return recc(expression); 
    }

    public static void main(String[] args) {
        String expression = "&(|(f))"; 
        boolean result = parseBoolExpr(expression);
        System.out.println("Result of expression " + expression + ": " + result);
    }
}
