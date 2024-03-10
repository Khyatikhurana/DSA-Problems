import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int m = nums2.length;
        int n = nums1.length;
        List<Integer> intersec = new ArrayList<>();
    
        HashSet<Integer> mpp = new HashSet<>();
        for(int i = 0 ; i< n; i++){
            mpp.add(nums1[i]);
        }
        for(int j = 0; j< m; j++){
            if(mpp.contains(nums2[j])){
                intersec.add(nums2[j]);
                mpp.remove(nums2[j]);
                
            }
        }
        
        int[] arr = new int[intersec.size()];
        for (int i = 0; i < intersec.size(); i++) {
            arr[i] = intersec.get(i);
        }
      
        return arr;
        
        
    }
}