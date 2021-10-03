public class Arrays02 {
    public static void main(String[] args) {
        public static void main(String[] args) {
        /**
         * Sorting an Array
         *
         * The Arrays class has a sort() method that is used to sort the arrays of objects and primitives. If we are
         * sorting a primitive array, then quicksort is used. And if we are sorting an object array, then merge sort is
         * used.
         *
         * Although quicksort is faster in both cases, it is not a stable algorithm. Merge sort is a stable algorithm, so
         * it is used in the case of sorting an object array. In the case of the primitive array, we don’t care about
         * stability, so quicksort is used.
         *
         * Stable sorting algorithms are algorithms that maintain the relative order of equal elements. For example,
         * we have an array [1,4,6,8,6], which we need to sort. Now after sorting this array, the result is [1,4,6,6,8].
         * Although there are two sixes in the array, we don’t care which six came first in the sorted array. But in the
         * case of an object array, the relative order of elements also matters. If two objects are the same in an object
         * array, then their relative order should be the same in the sorted array.
         *
         * The sort method has two variants:
         *
         * 1. sort(array) – sorts the full array into ascending order
         * 2. sort(array, fromIndex, toIndex) – sorts only the elements from fromIndex to toIndex.
         */
        Integer[] numbers = { 10, 2, 32, 12, 15, 76, 17, 48, 79, 9 };
        Arrays.sort(numbers);

        for (int i : numbers) {
            System.out.print(i + " ");
        }

        /**
         * Copying an Array
         *
         * Let's discuss how we can create a copy of an array using the copyOf() method.
         *
         * If we need to create copies of our array, then we can use the copyOf() method from the Arrays class. We need
         * to provide the array that needs to be copied and the new array’s size as a parameter.
         *
         * The below example shows how to create a copy of an array where the copied array size is the same as the original
         * array. If the new array’s size is greater than the original array, then the remaining positions are filled
         * with zeros.
         */
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int[] newArray = Arrays.copyOf(numbers, numbers.length);

        System.out.println("The copied array is: ");

        for (int i : newArray) {
            System.out.print(i + " ");
        }

        int[] newArrayBiggerSize = Arrays.copyOf(numbers, 20);
        System.out.println();
        System.out.println("The copied array is: ");

        for (int i : newArrayBiggerSize) {
            System.out.print(i + " ");
        }

        /**
         * It is possible that we may only want to copy a part of our original array. In that case, we can use the
         * copyOfRange() method. This method takes three arguments: the original array, the from index (which is inclusive),
         * and a to index (which is exclusive).
         */
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int[] newArray = Arrays.copyOfRange(numbers, 0, 5);

        System.out.println("The copied array is: ");

        for (int i : newArray) {
            System.out.println(i);
        }

        /**
         * Have you ever wondered what would happen if we create a copy of an array that contains objects of a custom class?
         *
         * If we change the object in the original array, will it be changed in the copied array?
         *
         * Let’s try to answer these questions using an example. In the below example, we have created an array of two
         * Employee objects. Then we created a copy of this array. We will see what happens when one of the Employee objects
         * is changed in the original array.
         */

        // Creating an Array of Employee objects.
        Employee[] employees = { new Employee(123, "Jay"), new Employee(124, "Ryan") };

        // Creating the copy of Array.
        Employee[] copiedArray = Arrays.copyOf(employees, 2);

        // Changing the name of first employee in original array.
        employees[0] = new Employee(123, "Changed Name");

        // Printing the name of first employee in original array.
        System.out.println(employees[0].empName);

        // Printing the name of first employee in copied array.
        System.out.println(copiedArray[0].empName);

        /**
         * As we can see from the above program’s output, the name did not change in the copied array. This means that
         * the copyOf() method creates a deep copy of objects instead of just changing the references.
         */
        }
    }
}
