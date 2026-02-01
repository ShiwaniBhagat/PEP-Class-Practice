class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n=nums1.length;
        int m=nums2.length;
        HashSet<Integer> h=new HashSet<>();
        if(n>m){
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(nums2[j]==nums1[i]) h.add(nums2[j]);
                }
            }
        }
        else{
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(nums1[j]==nums2[i]) h.add(nums1[j]);
                }
            }
        }
        int arr[]=new int[h.size()];
        int i=0;
        for(int val:h){
            arr[i]=val;
            i++;
        }
        return arr;
    }
}
// ANOTHER TWO POINTER SOLUTION
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> li=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                li.add(nums1[i]);
                while(i<nums1.length-1 && nums1[i]==nums1[i+1]) i++;
                while(j<nums2.length-1 && nums2[j]==nums2[j+1]) j++;
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]) i++;
            else  j++;
        }
        int arr[]=new int[li.size()];
        for(int k=0;k<arr.length;k++){
            arr[k]=li.get(k);
        }
        return arr;
    }
}
