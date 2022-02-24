import java.util.*;

class Program {

  public String tournamentWinner(
      ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
    // Write your code here.
		HashMap<String, Integer> scoresBoard = new HashMap<>();
		for (int i = 0; i < results.size(); i++) {
			ArrayList<String> competition = competitions.get(i);
			String homeTeam = competition.get(0);
			String awayTeam = competition.get(1);
			
			if (!scoresBoard.containsKey(homeTeam)) {
				scoresBoard.put(homeTeam, 0);		
			}
			
			if (!scoresBoard.containsKey(awayTeam)) {
				scoresBoard.put(awayTeam, 0);
			}
			
			if (results.get(i) == 1) {
				int prevScore = scoresBoard.get(homeTeam);
				scoresBoard.put(homeTeam, prevScore += 30);	
			} else {
				int prevScore = scoresBoard.get(awayTeam);
				scoresBoard.put(awayTeam, prevScore += 30);	
			}
		}
		
		String champion = "";
		int maxScores = 0;
		for (String team : scoresBoard.keySet()) {
			if (scoresBoard.get(team) > maxScores) {
				maxScores = scoresBoard.get(team);
				champion = team;
			}
		}
    return champion;
  }
}
