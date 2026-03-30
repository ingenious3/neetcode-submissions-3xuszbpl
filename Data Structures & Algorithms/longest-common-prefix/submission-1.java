class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String lcp = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String s = strs[i];
            int j = 0;
            while (j < lcp.length() && j < s.length() && lcp.charAt(j) == s.charAt(j)) {
                j++;
            }
            if (j == 0) {
                return "";
            }
            lcp = lcp.substring(0,j);
         }
        return lcp;
    }
}