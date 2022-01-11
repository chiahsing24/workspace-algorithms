class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> cur = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            cur.add(0, 1); // 每次在arrayList頭加1使長度增加
            for (int j = 1; j < cur.size() - 1; j++) {
                cur.set(j, cur.get(j) + cur.get(j + 1));
            }
            result.add(new ArrayList<>(cur));
        }
        
        return result;
    }
}