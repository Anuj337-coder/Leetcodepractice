class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        long k = (long) k1 + k2;
        int[] freq = new int[100001];
        int max = 0;
        long sum = 0;

        for (int i = 0; i < nums1.length; i++) {
            int d = Math.abs(nums1[i] - nums2[i]);
            freq[d]++;
            max = Math.max(max, d);
            sum += d;
        }

        if (sum <= k) {
            return 0;
        }

        for (int d = max; d > 0 && k > 0; d--) {
            int count = Math.min((long) freq[d] > k ? (int) k : freq[d], freq[d]);
            count = (int) Math.min((long) freq[d], k);

            freq[d] -= count;
            freq[d - 1] += count;
            k -= count;
        }

        long answer = 0;

        for (int d = 1; d < freq.length; d++) {
            answer += (long) d * d * freq[d];
        }

        return answer;
    }
}