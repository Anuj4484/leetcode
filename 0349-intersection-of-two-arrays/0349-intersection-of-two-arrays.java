class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        if(nums1.length > nums2.length){
            for(int i=0;i<nums2.length;i++){
                for(int j=0;j<nums1.length;j++){
                    if(nums2[i]==nums1[j]){
                        s.add(nums1[j]);
                    }
                }
            }
        }
        else
        {
            for(int i=0;i<nums1.length;i++){
                for(int j=0;j<nums2.length;j++){
                    if(nums1[i]==nums2[j]){
                        s.add(nums2[j]);
                    }
                }
            }
        }
        int []n = new int[s.size()];
        int k=0;
        for(int x:s){
            n[k] = x;
            k++;
        }
        return n;
    }
}