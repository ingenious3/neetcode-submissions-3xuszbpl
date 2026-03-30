class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();
        for (char ch : arr) {
            switch(ch) {
                case '(':
                case '{':
                case '[':
                    st.push(ch);
                    break;
                case ')':
                    if (st.isEmpty() || st.peek() != '(') {
                        return false;
                    }
                    st.pop();
                    break;
                case '}':
                    if (st.isEmpty() || st.peek() != '{') {
                        return false;
                    }
                    st.pop();  
                    break;
                case ']':
                    if (st.isEmpty() || st.peek() != '[') {
                        return false;
                    }
                    st.pop(); 
                    break;     
            }
        }
        return st.isEmpty();
    }
}
