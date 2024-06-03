class Solution {
    public String getPermutation(int n, int k) {
        int fact = 1;
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 1; i<n ; i++){
            //(n-1)!
            fact = fact * i;
            numbers.add(i);
        }
        numbers.add(n); // adding the last number
        String ans = "";
        k = k-1; //zero based indexing
        while(true){
            ans = ans + numbers.get(k/fact);
            numbers.remove(k/fact);
            if(numbers.size() == 0) break;
            //for next iteration
            k = k%fact;
            fact = fact/numbers.size();
            
        }
        return ans;
        
    }
}