class Solution {
    public String addBinary(String a, String b) {
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        aChars = reverse(aChars);
        bChars = reverse(bChars);

        StringBuilder sb = new StringBuilder();
        int cur = 0;
        int carry = 0;
        while (cur < aChars.length && cur < bChars.length) {
            char aChar = aChars[cur];
            char bChar = bChars[cur];
            if (aChar == '0' && bChar == '0') {
                if (carry == 0) {
                    sb.append('0');
                } else {
                    sb.append('1');
                    carry = 0;
                }
            } else if (aChar == '1' && bChar == '1') {
                if (carry == 0) {
                    sb.append('0');
                } else {
                    sb.append('1');
                }
                carry = 1;
            } else {
                if (carry == 0) {
                    sb.append('1');
                } else {
                    sb.append('0');
                    carry = 1;
                }
            }

            cur++;
        }

        while (cur < aChars.length) {
            char curChar = aChars[cur];
            if (curChar == '1') {
                if (carry == 1) {
                    sb.append('0');
                    carry = 1;
                } else {
                    sb.append('1');
                }
            } else {
                if (carry == 1) {
                    sb.append('1');
                    carry = 0;
                } else {
                    sb.append('0');
                }
            }

            cur++;
        }

        while (cur < bChars.length) {
            char curChar = bChars[cur];
            if (curChar == '1') {
                if (carry == 1) {
                    sb.append('0');
                    carry = 1;
                } else {
                    sb.append('1');
                }
            } else {
                if (carry == 1) {
                    sb.append('1');
                    carry = 0;
                } else {
                    sb.append('0');
                }
            }

            cur++;
        }

        if (carry == 1) {
            sb.append('1');
        }

        return sb.reverse().toString();
    }

    public char[] reverse(char[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }

        return array;
    }
}