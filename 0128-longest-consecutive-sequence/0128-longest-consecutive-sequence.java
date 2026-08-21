class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int count = 0;
        int maxCount = 0;
        Integer prev = null;

        for (int num : set) {
            if (prev != null && num == prev + 1) {
                count++;
            } else {
                count = 1;
            }

            maxCount = Math.max(maxCount, count);
            prev = num;
        }

        return maxCount;
    }
}