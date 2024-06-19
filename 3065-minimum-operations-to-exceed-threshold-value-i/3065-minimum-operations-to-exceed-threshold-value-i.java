class Solution {
    public int minOperations(int[] nums, int k) {
        int count=0;
        Arrays.sort(nums);
        for(int i =0;i<nums.length;i++){
            if(nums[i] == k || nums[i] > k){
                count = i;
                break;
            }
        }
        return count;
    }
}