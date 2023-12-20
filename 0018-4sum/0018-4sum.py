class Solution(object):
    def fourSum(self, nums, target):
        n=len(nums)
        arr=sorted(nums)
        ans=[]
        for i in range(0,n): #i and j are fixed pointers
            if i!=0 and arr[i]==arr[i-1]:
                continue
            for j in range(i+1,n):
                if j!=i+1 and arr[j]==arr[j-1]:
                    continue
                
                k=j+1
                l=n-1 #k,l are moving pointers
                while(k<l):
                    fourSum = arr[i] + arr[j] + arr[k] + arr[l]
                    if fourSum == target:
                        ans.append([arr[i],arr[j],arr[k],arr[l]])
                        k+=1
                        #l-=1
                        while k<l and arr[k]==arr[k-1]:
                            k+=1
                        
                        # while k<l and arr[l]==arr[l-1]:
                        #     l-=1 #skip duplicates
                    elif fourSum < target:
                        k+=1
                    else:
                        l-=1       
                    
        return ans
                        
                        
                
                

        """
        :type nums: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        