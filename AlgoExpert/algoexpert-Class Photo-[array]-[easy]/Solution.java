import java.util.*;

class Program {
  public boolean classPhotos(
    ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights
  ) {
    
    Collections.sort(redShirtHeights);
    Collections.sort(blueShirtHeights);
    
    return ableToTakePhoto(redShirtHeights, blueShirtHeights) || ableToTakePhoto(blueShirtHeights, redShirtHeights);
  }

  private boolean ableToTakePhoto(ArrayList<Integer> backRow, ArrayList<Integer> frontRow) {
    for (int i = 0; i < backRow.size(); i++) {
      if (backRow.get(i) <= frontRow.get(i)) {
        return false;
      }
    }

    return true;
  }
}
