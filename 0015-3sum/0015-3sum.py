class Solution(object):
    def threeSum(self, nums):
        arr=sorted(nums)
        ans=[]
        n=len(arr)
        for i in range(0,n):
            if i!=0 and arr[i]==arr[i-1]:
                continue
            j=i+1
            k=n-1 #j and k are moving pointers
            while j<k:
                
                threeSum=arr[i]+arr[j]+arr[k]
                if threeSum>0:
                    k-=1
                elif threeSum<0:
                    j+=1
                elif threeSum==0:
                    ans.append([arr[i],arr[j],arr[k]])
                    j+=1
                    k-=1
                    while j<k and arr[k]==arr[k+1]:
                        k-=1
                    while j<k and arr[j]==arr[j-1]:
                        j+=1 #skip duplicate
        return ans
                
            
        
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        