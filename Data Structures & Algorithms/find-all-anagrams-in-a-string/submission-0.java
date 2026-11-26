class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();
        List<Integer> res = new ArrayList<>();
        char[] pArr = p.toCharArray();
        Arrays.sort(pArr);
        String sortedP = new String(pArr);
        for (int i = 0; i <= n-m; i++) {
            char[] subS = s.substring(i, i+m).toCharArray();
            Arrays.sort(subS);
            if (new String(subS).equals(sortedP)) {
                res.add(i);
            }
        }
        return res;
    }
}
