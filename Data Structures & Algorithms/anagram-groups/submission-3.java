class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs == null || strs.length == 0) {
            return res;
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String s: strs) {
            String key = getKey(s);
            if (map.containsKey(key)) {
                map.get(key).add(s);
            } else {
                List<String> al = new ArrayList<>();
                al.add(s);
                map.put(key, al);
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
        char[] chArr = s.toCharArray();
        Arrays.sort(chArr);
        StringBuilder sb = new StringBuilder();
        for (char ch: chArr) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
