import java.util.*;
class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n){
        int i1=m-1;
        int i2=n-1;
        int merge=n+m-1; //extra space given in nums1
        
        while(i1>=0 && i2>=0){
            if(nums1[i1]>nums2[i2]){
                nums1[merge]=nums1[i1];
                merge--;
                i1--;
            }
            else{
                nums1[merge]=nums2[i2];
                merge--;
                i2--;
            }
        }
        
        while(i2>=0){
            nums1[merge--]=nums2[i2--];
        }
    }
}