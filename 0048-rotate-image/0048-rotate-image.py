class Solution(object):
    def rotate(self, matrix):
        #transpose
        for i in range(len(matrix)):
            for j in range(i):
                matrix[i][j],matrix[j][i]=matrix[j][i],matrix[i][j]
        
        #reverse
        for i in range(len(matrix)):
            matrix[i].reverse()
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        