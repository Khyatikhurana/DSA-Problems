class Solution {
    public int findDuplicate(int[] nums) {
        //Floyd's Tortoise and Hare algorithm
        //Cycle detection
        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);
        
        fast = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        
        return slow;
        
    }
}