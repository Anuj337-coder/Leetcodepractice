class Solution {
    public int[] rearrangeArray(int[] nums) {
        int arrp[] = new int[nums.length / 2];
        int arrn[] = new int[nums.length / 2];

        int i = 0;
        int j = 0;

        // Separate positive and negative numbers
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] > 0) {
                arrp[i] = nums[k];
                i++;
            } else {
                arrn[j] = nums[k];
                j++;
            }
        }

        int ans[] = new int[nums.length];

        // Put positive and negative alternately
        int p = 0;
        int n = 0;

        for (int k = 0; k < nums.length; k++) {
            if (k % 2 == 0) {
                ans[k] = arrp[p];
                p++;
            } else {
                ans[k] = arrn[n];
                n++;
            }
        }

        return ans;
    }
}