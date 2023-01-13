class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, HashMap<String, Integer>> records = new HashMap<>();
        for (int i = 0; i < matches.length; i++) {
            int winner = matches[i][0];
            int loser = matches[i][1];
            if (!records.containsKey(winner)) {
                HashMap<String, Integer> player = new HashMap<>();
                player.put("win", 0);
                player.put("lose", 0);
                records.put(winner, player);
            }

            if (!records.containsKey(loser)) {
                HashMap<String, Integer> player = new HashMap<>();
                player.put("win", 0);
                player.put("lose", 0);
                records.put(loser, player);
            }

            HashMap<String, Integer> winnerRecord = records.get(winner);
            HashMap<String, Integer> loserRecord = records.get(loser);

            winnerRecord.put("win", winnerRecord.get("win") + 1);
            loserRecord.put("lose", loserRecord.get("lose") + 1);

            records.put(winner, winnerRecord);
            records.put(loser, loserRecord);
        }

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> neverLose = new ArrayList<>();
        List<Integer> loseOne = new ArrayList<>();
        for (Map.Entry<Integer, HashMap<String, Integer>> entry : records.entrySet()) {
            Integer player = entry.getKey();
            Map<String, Integer> playerRecord = entry.getValue();
            if (playerRecord.get("lose") == 0) {
                neverLose.add(player);
            } else if (playerRecord.get("lose") == 1) {
                loseOne.add(player);
            }
        }

        Collections.sort(neverLose);
        Collections.sort(loseOne);
        ans.add(new ArrayList<Integer>(neverLose));
        ans.add(new ArrayList<Integer>(loseOne));

        return ans;
    }
}