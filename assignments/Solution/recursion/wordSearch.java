public class wordSearch {
    public static boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0) {
        return false;
    }
    
    for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[0].length; j++) {
            if (backtrack(board, word, i, j, 0)) {
                            return true;
                        }
                    }
                }
                return false;
            }
            public static boolean backtrack(char[][] board, String word, int i, int j, int index) {
    if (index == word.length()) {
        return true;
    }
    
    if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
        return false;
    }

    char temp = board[i][j];
    board[i][j] = '#'; 

    boolean found = 
        backtrack(board, word, i + 1, j, index + 1) ||
        backtrack(board, word, i - 1, j, index + 1) ||
        backtrack(board, word, i, j + 1, index + 1) ||
        backtrack(board, word, i, j - 1, index + 1);
    board[i][j] = temp;

    return found;
}
public static void main(String[] args) {
    char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}
};
String word = "ABCCED";
System.out.println(exist(board, word)); // true
}
}
