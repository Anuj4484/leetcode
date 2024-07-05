class Solution {
    public int[] decompressRLElist(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i+=2){
            count +=nums[i];
        }
        int []arr = new int[count];
        int ind=0;
        for(int i=0;i<nums.length;i+=2){
            for(int j=0;j<nums[i];j++){
                arr[ind++] = nums[i+1];
            }
        }
        return arr;
    }
}