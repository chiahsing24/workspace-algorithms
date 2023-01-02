/**
 *  Time: O(n x m)
 *  Space: O(1)
 */

class Solution {
    public int maximumWealth(int[][] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 1; j < accounts[0].length; j++) {
                accounts[i][j] = accounts[i][j - 1] + accounts[i][j];
            }
        }

        int numAccounts = accounts[0].length - 1;
        int maxWealth = accounts[0][numAccounts];
        for (int i = 1; i < accounts.length; i++) {
            maxWealth = Math.max(accounts[i][numAccounts], maxWealth);
        }

        return maxWealth;
    }
}