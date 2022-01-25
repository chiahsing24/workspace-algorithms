class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb1 = buildStr(s);
        StringBuilder sb2 = buildStr(t);
        return sb1.toString().equals(sb2.toString());
    }
    
    private StringBuilder buildStr(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (sb.length() != 0) {
                    sb.deleteCharAt(sb.length() - 1);
                } 
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb;
    }
}