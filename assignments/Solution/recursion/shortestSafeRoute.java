import java.util.Arrays;
public class shortestSafeRoute {

    static final int R = 12; 
    static final int C = 10; 

    static int[] rowNum = { -1, 0, 0, 1 };
    static int[] colNum = { 0, -1, 1, 0 };

    static int minDist;

    static boolean isSafe(int[][] mat, boolean[][] visited, int x, int y) {
        return mat[x][y] == 1 && !visited[x][y];
    }

    static boolean isValid(int x, int y) {
        return x >= 0 && x < R && y >= 0 && y < C;
    }

    static void markUnsafeCells(int[][] mat) {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (mat[i][j] == 0) { 
                    for (int k = 0; k < 4; k++) {
                        int newRow = i + rowNum[k];
                        int newCol = j + colNum[k];
                        if (isValid(newRow, newCol) && mat[newRow][newCol] == 1) {
                            mat[newRow][newCol] = -1; 
                        }
                    }
                }
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (mat[i][j] == -1) {
                    mat[i][j] = 0;
                }
            }
        }
    }

    static void findShortestPathUtil(int[][] mat, boolean[][] visited, int i, int j, int dist) {
        if (j == C - 1) {
            minDist = Math.min(dist, minDist);
            return;
        }

        if (dist >= minDist) {
            return;
        }

        visited[i][j] = true;

        for (int k = 0; k < 4; k++) {
            int newRow = i + rowNum[k];
            int newCol = j + colNum[k];
            if (isValid(newRow, newCol) && isSafe(mat, visited, newRow, newCol)) {
                findShortestPathUtil(mat, visited, newRow, newCol, dist + 1);
            }
        }

        visited[i][j] = false;
    }

    static void findShortestPath(int[][] mat) {
        minDist = Integer.MAX_VALUE; 
        boolean[][] visited = new boolean[R][C];

        markUnsafeCells(mat);

        for (int i = 0; i < R; i++) {
            if (mat[i][0] == 1) { 
                for (int k = 0; k < R; k++) {
                    Arrays.fill(visited[k], false); 
                }
                findShortestPathUtil(mat, visited, i, 0, 0); 
                if (minDist == C - 1) { 
                    break;
                }
            }
        }

        if (minDist != Integer.MAX_VALUE) {
            System.out.println("Length of shortest safe route is " + minDist);
        } else {
            System.out.println("Destination not reachable from the given source");
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
            { 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
            { 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 },
            { 1, 1, 1, 1, 0, 1, 1, 1, 1, 1 },
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
            { 1, 1, 1, 1, 1, 0, 1, 1, 1, 1 },
            { 1, 0, 1, 1, 1, 1, 1, 1, 0, 1 },
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
            { 0, 1, 1, 1, 1, 0, 1, 1, 1, 1 },
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
            { 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 }
        };

        findShortestPath(mat);
    }
}

    

