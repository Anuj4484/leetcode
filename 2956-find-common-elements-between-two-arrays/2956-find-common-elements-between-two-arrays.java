class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int [] arr = new int[2];
        int ans1 = 0;
        int ans2 = 0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    ans1++;
                    break;
                }
            }
        }

        for(int i=0;i<nums2.length;i++){
            for(int j=0;j<nums1.length;j++){
                if(nums2[i] == nums1[j]){
                    ans2++;
                    break;
                }
            }
        }
        arr[0] = ans1;
        arr[1] = ans2;
        return arr;
    }
}