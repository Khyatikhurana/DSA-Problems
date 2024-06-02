class Solution {
    
    public void findComb(int idx, int[] arr, int target, List<List<Integer>> ansList, List<Integer> ds){
        if(idx == arr.length){
            if(target == 0){
                ansList.add(new ArrayList<>(ds));
            }
            return;
        }
        
        if(arr[idx] <= target){
            
            ds.add(arr[idx]);
            //pick, not idx +1 because duplicate elements allowed
            findComb(idx,arr, target - arr[idx], ansList,ds);
            ds.remove(ds.size()-1);
        }
        //do not pick
        findComb(idx+1, arr, target, ansList, ds);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ansList = new ArrayList<>(); //final ds
        findComb(0,candidates, target, ansList, new ArrayList<>()); //empty data structure
        return ansList;
        
    }
}