class Solution {
    public String customSortString(String order, String s) {
        int precedence = order.length();
        HashMap<Character, Integer> precedenceMap = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            precedenceMap.put(order.charAt(i), precedence);
            precedence--;
        }

        List<Character> sCharsList = new ArrayList<>();
        for (char c : s.toCharArray()) {
            sCharsList.add(c);
        }

        Collections.sort(sCharsList, (a, b) -> {
            int precedenceA = precedenceMap.getOrDefault(a, 0);
            int precedenceB = precedenceMap.getOrDefault(b, 0);
            if (precedenceA > precedenceB) {
                return -1;
            } else if (precedenceA < precedenceB) {
                return 1;
            } else {
                return 0;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sCharsList.size(); i++) {
            sb.append(sCharsList.get(i));
        }

        return sb.toString();
    }
}