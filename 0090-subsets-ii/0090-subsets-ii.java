class Solution {
    public void findsubset(int idx, int[] nums, List<Integer> ds, List<List<Integer>> ansList){
        ansList.add(new ArrayList<>(ds));
        for(int i = idx; i< nums.length; i++){
            
            if(i != idx && nums[i] == nums[i-1]) continue;
            //add element
            ds.add(nums[i]);
            findsubset(i+1,nums,ds,ansList);
            ds.remove(ds.size() -1 );
        }
        
        
    }
    
    
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ansList = new ArrayList<>();
        findsubset(0,nums,new ArrayList<>(),ansList);
        return ansList;
        
       
    }
}