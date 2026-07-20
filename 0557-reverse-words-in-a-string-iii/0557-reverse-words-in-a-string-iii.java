class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        int i = 0;

        while (i < n) {
            int start = i;

            while (i < n && s.charAt(i) != ' ') {
                i++;
            }

            for (int j = i - 1; j >= start; j--) {
                ans.append(s.charAt(j));
            }

            //  ab check kro ki or words to ni hai 
            if (i < n) {
                ans.append(' ');
                i++; 
            }
        }

        return ans.toString();
    }
}