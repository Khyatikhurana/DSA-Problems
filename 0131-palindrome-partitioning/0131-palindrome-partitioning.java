class Solution {
    
    public void getSubseq(String s, int idx, List<String> newlst,List<List<String>> ans){
        if(idx == s.length()){
            ans.add(new ArrayList<>(newlst));
            return;
                    
  
        }
        
        for(int i = idx ; i < s.length(); i++){
            if(checkPalindrome(s, idx, i)) {
                String substr = s.substring(idx,i+1);
                newlst.add(substr);
                getSubseq(s,i+1,newlst,ans);
                newlst.remove(newlst.size()-1);
            }
                
            
        }
        
     
    }
    
    public static boolean checkPalindrome(String str, int start, int end){
        while(start <= end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
            
        }
        return true;
    }
    
    
    public List<List<String>> partition(String s) {
        
        List<List<String>> ans= new ArrayList<>();
        List<String> newlst = new ArrayList<>();
        getSubseq(s,0,newlst, ans);
        return ans;
        
        
    }
}