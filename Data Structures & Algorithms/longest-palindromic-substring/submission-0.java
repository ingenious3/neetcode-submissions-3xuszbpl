class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {

            // Case 1: Odd-length palindrome
            int len1 = expandAroundCenter(s, i, i);

            // Case 2: Even-length palindrome
            int len2 = expandAroundCenter(s, i, i + 1);

            // Get maximum palindrome length
            int maxLen = Math.max(len1, len2);

            if (maxLen > end - start + 1) {

                start = i - (maxLen - 1) / 2;
                end = i + maxLen / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {

        while (left >= 0 &&
               right < s.length() &&
               s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        // Return palindrome length
        return right - left - 1;
    }


}
