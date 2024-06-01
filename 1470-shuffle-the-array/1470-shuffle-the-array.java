class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] num = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i % 2 == 0){
                num[i] = nums[i/2];
            }
            else{
                num[i] = nums[n+(i-1)/2];
            }
        }
        return num;
    }
}