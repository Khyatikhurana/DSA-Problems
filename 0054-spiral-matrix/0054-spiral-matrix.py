class Solution(object):
    def spiralOrder(self, matrix):
        """
                    left    right
        matrix=[top [1 , 2 , 3],
                    [4 , 5 , 6],
                    [7 , 8 , 9]]
                    bottom
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        spiral=[]
        
        rows,col=len(matrix),len(matrix[0])
        top=0
        bottom=rows-1
        left=0
        right=col-1
        
        while(top<=bottom and left<=right):
            for i in range(left,right+1):
                spiral.append(matrix[top][i]) #1,2,3
            top+=1 #now 3 will not be printed twice
            
            for i in range(top,bottom+1):
                spiral.append(matrix[i][right]) #6,9
            
            right-=1 # so 9 is not printed twice
            
            if(top<=bottom):
                for i in range(right,left-1,-1):
                    spiral.append(matrix[bottom][i])
                bottom-=1
            
            if(left<=right):
                for i in range(bottom,top-1,-1):
                    spiral.append(matrix[i][left])
                left+=1
        return spiral
        
            
        