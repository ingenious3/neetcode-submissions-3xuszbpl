class Solution {
    public boolean validPalindrome(String s) {
        for (int i = 0, j = s.length()-1; i<j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return check(i+1,j,s) || check(i, j-1, s);
            }
        }
        return true;        
    }

    private boolean check(int i, int j, String s) {
        for (; i<j; i++,j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}