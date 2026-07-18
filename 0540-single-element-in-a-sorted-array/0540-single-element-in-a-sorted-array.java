class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int left = 1;
        int right = n - 2;

        // Check boundary cases
        if (n == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[n - 1] != nums[n - 2]) return nums[n - 1];

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Found the single element
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            int pairStart;

            if (nums[mid] == nums[mid - 1]) {
                pairStart = mid - 1;
            } else {
                pairStart = mid;
            }

            if (pairStart % 2 == 0) {
                // Proper pairing till here, single is on the right
                left = mid + 1;
            } else {
                // Pairing shifted, single is on the left
                right = mid - 1;
            }
        }

        return -1;
    }
}
// bht easy hai bss thoda smjhne k zrurt hai or hrr chijn dhyan se krne k baki ekd easy hau 