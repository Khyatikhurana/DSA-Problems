class Solution(object):
    def nextPermutation(self, nums):
        index=-1 #break point
        n=len(nums)
        # Step 1: Find the break point:
        for i in range(n-2,-1,-1): #iterates from second last to first element
            if nums[i]<nums[i+1]:
                index=i #i is the break point
                break
        
        #if break point does not exist
        if index==-1:
            nums.reverse()
            return nums #we get the first combination
        
        for i in range(n-1,index,-1):
            if nums[i]>nums[index]:
                nums[i],nums[index]=nums[index],nums[i] #swap with element at break point
                break
        
        #reverse right hand side
        nums[index+1:]=reversed(nums[index+1:])
        
        return nums
        
        
        
        
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        