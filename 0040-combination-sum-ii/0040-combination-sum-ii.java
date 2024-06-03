class Solution {
    
    public void findComb(int idx, int[] arr, int target, List<List<Integer>> ansList, List<Integer> ds){
        if(target == 0){
            ansList.add(new ArrayList<>(ds));
            return;
            }
            
        
        for(int i = idx; i< arr.length; i++){

        if(i > idx && arr[i] == arr[i-1]) continue;
        if(arr[i] > target) break;
            ds.add(arr[i]);
            //pick
            findComb(i+1,arr, target - arr[i] ,ansList,ds);
            ds.remove(ds.size()-1);
        }

        
        
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ansList = new ArrayList<>(); //final ds
        findComb(0,candidates, target, ansList, new ArrayList<>()); //empty data structure
        return ansList;
        
    }
}