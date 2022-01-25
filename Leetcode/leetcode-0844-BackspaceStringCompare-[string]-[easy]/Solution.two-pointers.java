class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1, j = t.length() - 1;
        
        int sHashCnt = 0; 
        int tHashCnt = 0;
        while (i >= 0 || j >= 0) {
            while (i >= 0) {
                if (s.charAt(i) == '#') {
                    sHashCnt++;
                    i--;
                } else if (sHashCnt > 0) {
                    sHashCnt--;
                    i--;
                } else {
                    break;
                }
            }
            System.out.println("i = " + i);
            
            while (j >= 0) {
                if (t.charAt(j) == '#') {
                    tHashCnt++;
                    j--;
                } else if (tHashCnt > 0) {
                    tHashCnt--;
                    j--;
                } else {
                    break;
                }
            }
            System.out.println("j = " + j);
            
            if (i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)) {
                return false;
            }
            
            if ((i >= 0) != (j >= 0)) return false;
            i--;
            j--;
        }
        return true;
    }
}