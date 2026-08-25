class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }

        for (int i = k; ; i += k) {
            if (!hs.contains(i)) {
                return i;
            }
        }
    }
}
