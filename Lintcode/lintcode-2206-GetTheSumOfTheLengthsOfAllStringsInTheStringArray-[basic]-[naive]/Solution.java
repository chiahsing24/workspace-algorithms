public class Solution {
    public int getArrayStringLength(String[] stringArray) {
        int length = 0;
        if ((stringArray != null) && (stringArray.length != 0)) {
            for (String str : stringArray) {
                length += str.length();
            }
        }
        return length;
    }
} 