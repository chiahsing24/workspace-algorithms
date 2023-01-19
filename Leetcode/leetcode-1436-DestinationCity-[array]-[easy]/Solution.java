class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String, String> map = new HashMap<>();
        for (List<String> pair : paths) {
            map.put(pair.get(0), pair.get(1));
        }

        String destination = "";
        for (String possibleDestination : map.values()) {
            if (map.get(possibleDestination) == null) {
                destination = possibleDestination;
            }
        }

        return destination;
    }
}