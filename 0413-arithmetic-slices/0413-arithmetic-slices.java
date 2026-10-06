class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;

        if (n < 3) {
            return 0;
        }

        int count = 0;
        int left = 0;

        for (int right = 2; right < n; right++) {

            int diff1 = nums[right - 1] - nums[right - 2];
            int diff2 = nums[right] - nums[right - 1];

            if (diff1 == diff2) {
                count += right - left - 1;
            } else {
                left = right - 1;
            }
        }

        return count;
    }
}