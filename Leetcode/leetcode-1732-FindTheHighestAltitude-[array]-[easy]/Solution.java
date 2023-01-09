class Solution {
    public int largestAltitude(int[] gain) {
        int[] altitude = new int[gain.length];
        altitude[0] = gain[0];
        int highest = Math.max(0, altitude[0]);
        
        for (int i = 1; i < gain.length; i++) {
            altitude[i] = altitude[i - 1] + gain[i];
            highest = Math.max(highest, altitude[i]);
        }

        return highest;
    }
}