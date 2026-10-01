class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length;

        // Total sum of all cards
        int total = 0;

        for (int i = 0; i < n; i++) {
            total += cardPoints[i];
        }

        // Cards that we will leave behind
        int windowSize = n - k;

        // If k == n, we take all cards
        if (windowSize == 0) {
            return total;
        }

        // First window
        int windowSum = 0;

        for (int i = 0; i < windowSize; i++) {
            windowSum += cardPoints[i];
        }

        int minWindowSum = windowSum;

        // Sliding window
        int left = 0;

        for (int right = windowSize; right < n; right++) {

            windowSum += cardPoints[right];
            windowSum -= cardPoints[left];

            left++;

            minWindowSum = Math.min(minWindowSum, windowSum);
        }

        return total - minWindowSum;
    }
}