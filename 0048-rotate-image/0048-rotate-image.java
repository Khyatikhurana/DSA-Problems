import java.util.*;
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length; //Row
        int m = matrix[0].length; //Column
        //transpose
        for(int i = 0; i < n; i++){
            for(int j = i ; j< m; j++){
                //swapping matrix[i][j] and matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                
            }             
        }
        
        //reversing matrix
        //traverse row
        for(int i = 0; i < n ; i++){
            //traverse column until middle of row
            for(int j = 0; j < n/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j]; //row-same, moving element from opposite end to curr position
                matrix[i][n - 1 - j] = temp;
            }
        }
        
    }
}