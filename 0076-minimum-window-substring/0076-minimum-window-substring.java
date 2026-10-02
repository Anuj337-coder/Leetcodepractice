class Solution {
    public String minWindow(String s, String t) {

        int[] freq = new int[128];

        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i)]++;
        }

        int left = 0;
        int count = 0;

        int minLength = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            if (freq[ch] > 0) {
                count++;
            }

            freq[ch]--;

            while (count == t.length()) {

                int length = right - left + 1;

                if (length < minLength) {
                    minLength = length;
                    start = left;
                }

                char leftChar = s.charAt(left);

                freq[leftChar]++;

                if (freq[leftChar] > 0) {
                    count--;
                }

                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLength);
    }
}