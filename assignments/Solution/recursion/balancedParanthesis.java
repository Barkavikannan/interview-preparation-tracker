public class balancedParanthesis {
    public static boolean isBalanced(String s, int index, int count) {
        if (index == s.length()) {
            return count == 0; 
        }

        char current = s.charAt(index);
        if (current == '(') {
            return isBalanced(s, index + 1, count + 1);
        } else if (current == ')') {
            return count > 0 && isBalanced(s, index + 1, count - 1);
        } else {
            return isBalanced(s, index + 1, count);
        }
    }
    public static void main(String[] args) {
        String s = "((()))";
        System.out.println(isBalanced(s, 0, 0)); 
    
    }
    
}
