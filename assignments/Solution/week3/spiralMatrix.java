//package interview-preparation-tracker.assignments.Solution.week3;

import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
            int left=0;
            int right= matrix[0].length-1;
            int top=0;
            int bottom=matrix.length-1;
            List<Integer> result= new ArrayList<>();
    
            while( left<=right&& top<=bottom) {
                for(int i=left;i<=right;i++) {
                    result.add(matrix[top][i]);
                }
                top++;
                for(int i=top;i<=bottom;i++) {
                    result.add(matrix[i][right-1]);
                }
                right--;
                if(!(top<=bottom&& left<=right)) {
                    for(int i=right;i>=left;i--) {
                        result.add(matrix[bottom-1][i]);
                    }
                    bottom--;
                    }
                    
                    for(int i=bottom;i>=top;i--) {
                        result.add(matrix[i][left]);
                    }
                    left++;
                }
            
                return result;
            }
                
                
        public static void main(String[] args){
            int[][] matrix = {{1,2,3},
                              {4,5,6},
                              {7,8,9}};
            System.out.println(spiralOrder(matrix));
        }
    }

