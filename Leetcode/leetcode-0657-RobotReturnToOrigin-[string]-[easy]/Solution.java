class Solution {
    public boolean judgeCircle(String moves) {
        if (moves.length() == 0) return true;
        
        int[] position = {0, 0};
        for (int i = 0; i < moves.length(); i++) {
            char nextMove = moves.charAt(i);
            switch (nextMove) {
                case 'R':
                    position[1] += 1;
                    break;
                
                case 'L':
                    position[1] -= 1;
                    break;
                    
                case 'U':
                    position[0] -= 1;
                    break;
                    
                case 'D':
                    position[0] += 1;
                    break;
            }
        }
        
        if (position[0] == 0 && position[1] == 0) {
            return true;
        }
        return false;
    }
}