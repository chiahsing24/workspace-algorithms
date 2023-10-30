import java.util.*;

class Program {
  public int nonConstructibleChange(int[] coins) {
    // Write your code here.
    Arrays.sort(coins);
    
    int possibleVals = 0;
    for (int i = 0; i < coins.length; i++) {
      if (coins[i] > possibleVals + 1) {
        return possibleVals + 1;
      }
      
      possibleVals += coins[i];
    }

    return possibleVals + 1;
  }
}