class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int maxLength = 0;
        int maxFreq = 0;

        int[] freq = new int[26];

        while (right < s.length()) {

            // increase frequency
            freq[s.charAt(right) - 'A']++;

            // update max frequency in window
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            // check if window invalid
            if ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }
}