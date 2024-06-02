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
            findComb(idx,arr, target - arr[idx], ansList,ds);
            ds.remove(ds.size()-1);
        }
        findComb(idx+1, arr, target, ansList, ds);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ansList = new ArrayList<>();
        findComb(0,candidates, target, ansList, new ArrayList<>());
        return ansList;
        
    }
}