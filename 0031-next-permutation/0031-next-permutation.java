import java.util.*;

class Solution {
    public int[] nextPermutation(int[] nums) {
        //[ 2 1 5 4 3 0 0 ] 1 is break point
        int n = nums.length;
        int ind = -1;
        
        //finding index of break point
        for(int i = n-2; i >= 0 ; i--){
            if(nums[i] < nums[i+1]){
                ind = i;
                break;
            }
        }
        
        // if there is no next permutation i.e we have 5 4 3 2 1 then reverse and guve first permutation i.e 1 2 3 4 5
        if(ind == -1){
            Arrays.sort(nums); // sorts array in inc order i.e rev of given
            return nums;
        }
        
        //replacing break point element with num>break point (just greater)
        
        for(int i = n-1; i > ind; i--){
            if(nums[i] > nums[ind]){
                int temp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = temp;
                break;
                // swap(nums[i] , nums[ind]);
            }
        }
        
        //reverse the elements left as they are in dec order
        // Arrays.reverse(nums, ind+1, n-1);
        Arrays.sort(nums, ind+1, n);
        return nums;
        
        
        
    }
}