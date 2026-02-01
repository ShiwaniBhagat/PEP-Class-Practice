class Solution {
    public int findLHS(int[] nums) {
        int max=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int k: nums){
            if(h.containsKey(k)) h.put(k,h.get(k)+1);
            else h.put(k,1);
        }
        for(int k:h.keySet()){
            if(h.containsKey(k+1)){
                max=Math.max(max,h.get(k)+h.get(k+1));
            }
        }
        return max;
    }
}   
