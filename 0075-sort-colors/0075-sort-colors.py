class Solution(object):
    def sortColors(self, nums):
        #Dutch National Flag problem
        #case 0: swap 0 with element at start pointer. start++, mid++
        #case 2: swap with end, end--
        #case 1:no swap,mid++
        start=0
        mid=0
        end=len(nums)-1
        while mid<=end:
            if nums[mid]==0:
                nums[start],nums[mid]=nums[mid],nums[start]
                start+=1
                mid+=1
            elif nums[mid]==1:
                mid+=1
            else:
                nums[mid],nums[end]=nums[end],nums[mid]
                end-=1
                
        
        