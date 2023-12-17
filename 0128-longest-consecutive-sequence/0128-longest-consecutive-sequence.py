class Solution(object):
    def longestConsecutive(self, nums):
        n=len(nums)
        maxi=1
        if n==0:
            return 0
        elem=set()
        for i in range(0,n):
            elem.add(nums[i])
        
        for a in elem:
            if a-1 not in elem:
                count=1
                x=a
                while x+1 in elem:
                    x=x+1
                    count+=1
                maxi=max(maxi,count)
        return maxi
        
        