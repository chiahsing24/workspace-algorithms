public class Solution {
    /**
     * @param letters: A string
     * @return: A string
     */
    public String lowercaseToUppercase2(String letters) {
        // write your code here
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < letters.length(); i++) {
            char c = letters.charAt(i);
            if (Character.isLowerCase(c)) {
                sb.append(c -= 32);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}