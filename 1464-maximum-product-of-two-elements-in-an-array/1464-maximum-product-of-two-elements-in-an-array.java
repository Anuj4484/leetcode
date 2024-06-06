class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        int max1=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                max = (nums[i]-1)*(nums[j]-1);
                if(max1>max){
                    max = max1;
                }
            }
        }
        return max;
    }
}