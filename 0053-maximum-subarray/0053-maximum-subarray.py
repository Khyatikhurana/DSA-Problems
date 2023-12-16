class Solution(object):
    def maxSubArray(self, nums):
        maxi=float('-inf')
        totalsum=0
        for i in range(0,len(nums)):
            totalsum=totalsum+nums[i]
            
            if totalsum>maxi:
                maxi=totalsum
            
            if totalsum<0:
                totalsum=0
        
        return maxi
        
            
        