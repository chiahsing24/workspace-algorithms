class Solution {
    public List<Integer> getRow(int rowIndex) {
        Integer[] init = new Integer[rowIndex + 1];
        Arrays.fill(init, new Integer(0));
        List<Integer> result = Arrays.asList(init);

        result.set(0, 1);
        
        for (int i = 1; i <= rowIndex; ++i) {
            for (int j = i; j >= 1; --j) {
                result.set(j, result.get(j - 1) + result.get(j));
            }
        }
        
        return result;
    }
}