class Solution(object):
    def setZeroes(self, matrix):
        rows=len(matrix)
        cols=len(matrix[0])
        rowZero=False
        
        #Mark which row, col needs to be zero
        for r in range(rows):
            for c in range(cols):
                if matrix[r][c]==0:
                    matrix[0][c]=0 #set first row in that column to zero
                    
                    if r>0: #as we have rowZero for first one
                        matrix[r][0]=0
                    else:
                        rowZero=True
        
        for r in range(1,rows):
            for c in range(1,cols):
                if matrix[0][c]==0 or matrix[r][0]==0: #if they are marked
                    matrix[r][c]=0
                    
        if matrix[0][0]==0:
            for r in range(rows):
                matrix[r][0]=0
        
        if rowZero:
            for c in range(cols):
                matrix[0][c]=0
                    
        