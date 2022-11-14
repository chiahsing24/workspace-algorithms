public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.size(); i++) {
            int len = strs.get(i).length();
            sb.append(len);
            sb.append('#');
            sb.append(strs.get(i));
        }
        
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        
        int index = 0;
        while (index < s.length()) {
            int delimiterPos = s.indexOf('#', index);
            int strLen = Integer.valueOf(s.substring(index, delimiterPos));
            StringBuilder str = new StringBuilder(s.substring(delimiterPos + 1, delimiterPos + 1 + strLen));            
            result.add(str.toString());
            index = delimiterPos + 1 + strLen;
        }
        
        return result;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));