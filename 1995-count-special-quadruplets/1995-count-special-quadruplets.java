class Solution {
    public int countQuadruplets(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (i < j) {
                    for (int k = j + 1; k < nums.length - 1; k++) {
                        if (j < k) {
                            for (int s = k + 1; s < nums.length; s++) {
                                if (k < s) {
                                    if (nums[i] + nums[j] + nums[k] == nums[s]) {
                                        count++;
                                    }
                                }

                            }
                        }

                    }
                }
            }
        }
        return count;
    }
}