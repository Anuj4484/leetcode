class Solution {
    public int[] leftRightDifference(int[] nums) {
        int [] leftsum = new int[nums.length];
        leftsum[0] = 0;
        int [] rightsum = new int[nums.length];
        rightsum[nums.length-1] = 0;
        int [] res = new int[nums.length];

        for(int i=1;i<nums.length;i++){
            leftsum[i] = leftsum[i-1]+nums[i-1];
        }

        for(int i=nums.length-2;i>=0;i--){
            rightsum[i] = rightsum[i+1]+nums[i+1];
        }

        for(int i=0;i<leftsum.length;i++){
            res[i] = Math.abs(leftsum[i] - rightsum[i]);
            
        }
        return res;
    }
}