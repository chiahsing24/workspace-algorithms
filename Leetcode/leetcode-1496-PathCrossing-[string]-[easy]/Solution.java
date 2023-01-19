class Solution {
    public boolean isPathCrossing(String path) {    
        int i = 0, j = 0;
        HashSet<String> visited = new HashSet<>();
        visited.add(i + "," + j);
        for (char step : path.toCharArray()) {
            if (step == 'E') {
                j++;
            } else if (step == 'W') {
                j--;
            } else if (step == 'S') {
                i++;
            } else {
                i--;
            }

            if (visited.contains(i + "," + j)) {
                return true;
            } else {
                visited.add(i + "," + j);
            }
        }

        return false;
    }
}