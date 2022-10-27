class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0; i<nums.length; i++) {
            int targetVal = target - nums[i];
            for(int j = 0; j < nums.length; j++) {
                if(targetVal == nums[j] && i!=j) {
                    result[1] = j;
                    result[0] = i;
                }
            }
        }
        return result;
    }
}