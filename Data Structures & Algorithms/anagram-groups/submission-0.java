class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs == null || strs.length == 0) {
            return res;
        }
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s: strs) {
            String key  = getKey(s);
            if (map.containsKey(key)) {
                map.get(key).add(s);
            } else {
                List<String> ls = new ArrayList<>();
                ls.add(s);
                map.put(key, ls);
            }
        }
        for (Map.Entry<String, List<String>> mapEntry: map.entrySet()) {
            res.add(mapEntry.getValue());
        }
        return res;
    }

    private String getKey(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb  = new StringBuilder();
        for (char c: arr) {
            sb.append(c);
        }
        return sb.toString();
    }
}
