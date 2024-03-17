import java.util.*;
class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;//rows
        int m = matrix[0].length; //col
        // int[] row = new int[n]; row--> matrix[..][0]
        // int[] col = new int[m]; col--> matrix[0][..]
        int col0=1;
        
        //marking row and col 0 if 0 is encountered in matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    //ith row
                    matrix[i][0]=0;
                    //jth col
                    if(j!=0)
                    matrix[0][j]=0;
                    else
                        col0=0;
                }
             }
        }
        
        //traverse matrix-(row and col) to mark zero
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]!=0){
                     if( matrix[i][0] == 0 || matrix[0][j]==0 ){
                         matrix[i][j]=0;
                }
                    
                }
               
            }
        
        }
        
        // marking column
        if(matrix[0][0]==0){
            for(int j=0;j<m;j++){
                matrix[0][j]=0;
            }   
        }
        
        if(col0==0){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }
    }
}