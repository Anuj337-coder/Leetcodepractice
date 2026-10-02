class Solution {
    public int minimumDifference(int[] nums, int k) {

        Arrays.sort(nums);

        int left = 0;
        int minDiff = Integer.MAX_VALUE;

        for (int right = k - 1; right < nums.length; right++) {

            int diff = nums[right] - nums[left];

            minDiff = Math.min(minDiff, diff);

            left++;
        }

        return minDiff;
    }
}