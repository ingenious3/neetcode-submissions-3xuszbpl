class Solution {
    public int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        int[] hash = new int[26];
        for (char c: arr) {
            hash[c-'a']++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (hash[arr[i]-'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}