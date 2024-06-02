class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] num = new int[nums.length];
        int count = 0;;
        for(int i=0;i<nums.length;i++){
            if(i % 2 == 0){
                num[i] = nums[count];
                count++;
            }
            else{
                num[i] = nums[n];
                n++;
            }
        }
        return num;
    }
}