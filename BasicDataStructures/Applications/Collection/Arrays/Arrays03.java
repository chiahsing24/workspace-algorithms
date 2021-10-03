public class Arrays03 {
    public static void main(String[] args) {
        /**
         * Converting an Array into a List
         * We can convert an array into a list using the asList() method. If any changes are made to the resulting list,
         * then changes are propagated to the original array. The asList() method returns a fixed-size list, so it is not
         * possible to add or remove elements from this list.
         */
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<Integer> list = Arrays.asList(numbers);

        System.out.print(list);

        /**
         * Checking if two arrays are equal#
         * We can use the equals() method of the Arrays class to check if the two arrays are equal or not. Two arrays are
         * considered equal if both have the same number of elements and all corresponding pairs of elements in the two
         * arrays are equal.
         */
        Integer[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        boolean isEqual = Arrays.equals(numbers1, numbers2);

        System.out.print("Checking if two arrays are equal : " + isEqual);

        /**
         * Filling an array with default value#
         * Have you ever encountered a scenario where you need to initialize an array and then fill it with some default
         * value?
         *
         * If yes, then you might have iterated the array and filled each element with the default value. This task can
         * be made simple using the fill() method of the Arrays class. This method takes an array and a default value as
         * input. It then assigns the default value to each element of the array.
         */
        Integer[] numbers3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Arrays.fill(numbers3, 20);

        for (int i : numbers3) {
            System.out.print(i + " ");
        }
    }
}
