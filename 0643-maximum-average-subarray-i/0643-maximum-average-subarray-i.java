class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        int sum = 0;

        double ans = Double.NEGATIVE_INFINITY;

        while (right < n) {
            sum = sum + nums[right];

            if (right - left + 1 == k) {
                double avg = (double) sum / k;
                ans = Math.max(ans, avg);

                sum = sum - nums[left];
                left++;
            }

            right++;
        }

        return ans;
    }
}