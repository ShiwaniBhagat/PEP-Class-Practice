class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> h=new HashMap<>();
        List<List<String>> res=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            char arr[]=strs[i].toCharArray();
            Arrays.sort(arr);
            String a=new String(arr);
            if(h.containsKey(a)){
                h.get(a).add(strs[i]);
            }
            else {
                List<String> li=new ArrayList<>();
                li.add(strs[i]);
                h.put(a,li);
            }
        }
        res.addAll(h.values());
        return res;
    }
}
