
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ArrayList03 {
    public static void main(String[] args) {
        // Elements can be removed from an ArrayList in the following ways.

        /**
         * 1. Removing an element at a particular index
         * We can use the remove(int index) method to remove an element at a particular index. The index should be less
         * than the size of ArrayList, otherwise, IndexOutOfBoundsException is thrown.
         */

        /**
         * 2. Removing a particular element from the ArrayList
         * We can also specify the element that we want to remove using the remove(Object o) method, and the first
         * occurrence of that element will be removed.
         */

        /**
         * 3. Removing all the elements within a range
         * Let’s suppose we need to remove all the elements from index 5 to 9. This can be done using the
         * removeRange(int fromIndex, int toIndex) method. This method will remove, from this list, all of the elements
         * whose index is between fromIndex, inclusive, and toIndex, exclusive. Please note that this method is not
         * defined in the List class. So, it can be used only when the reference type is also ArrayList and not List.
         */

        /**
         * 4. Removing all the elements within a given Collection
         * We can use the removeAll(Collection<?> c) method to remove, from the given list, all of the elements that are
         * contained in the specified collection.
         */

        /**
         * 5. Removing all the elements from the ArrayList
         * We can use the clear() method to remove all the elements from the ArrayList.
         */

        /**
         * !! We saw that remove(int index) removes a method at the given index and remove(Object o) removes the given
         * object from the ArrayList. Suppose we have an ArrayList that contains five elements i.e [13, 21, 43, 2, 9].
         * Now, if we do list.remove(2), then which overloaded method will be called. Will remove(int index) be called
         * or remove(Object o) be called? remove(int index) will be called because we are passing a primitive to remove
         * method. If we want to delete element 2, we should call remove(new Integer(2)) because elements are stored in
         * an ArrayList as objects and not primitives.
         */

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.remove(new Integer(30));
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(50);
        list2.add(60);
        list.removeAll(list2);
        System.out.println(list);

        list.clear();
        System.out.println(list);

        /**
         * Replacing all the elements of the ArrayList
         * A new method, replaceAll(UnaryOperator<E> operator), was added in Java 8. This method takes a single
         * UnaryOperator type argument. The UnaryOperator interface is a functional interface that has a single abstract
         * method, apply(), that returns a result of the same object type as the operand.
         *
         * Let’s say we have an ArrayList that contains String objects; we need to make all the elements in this list
         * uppercase. In this case, we can use the replaceAll() method and provide it with a lambda expression that
         * converts each element into uppercase.
         */
        List<String> newList = new ArrayList<>();
        newList.add("apple");
        newList.add("banana");

        newList.replaceAll((element) -> element.toUpperCase());
        System.out.println(newList);

        // Additional operations on ArrayList#
        /**
         * Updating an element in ArrayList
         * To update an element in ArrayList, the set(int index, E e) method can be used. This method takes the index,
         * which needs to be updated and a new value.
         */

        /**
         * Checking if an element is present in the ArrayList
         * To check if an element is present in the list, we can use the contains(Object o) method. This method returns
         * true if the element is present in the list; otherwise, it returns false.
         *
         * If we need the index of the first occurrence of the element, then the indexOf(Object o) method can be used.
         * And if we need the last occurrence of the element, the lastIndexOf(Object o) can be used.
         */
        List<Integer> testList = new ArrayList<>();
        testList.add(10);
        testList.add(20);
        testList.add(30);
        testList.add(40);
        testList.add(10);

        testList.set(1, 100);
        System.out.println(testList);

        if (testList.contains(30)) {
            System.out.println("testList contains 30");
        }

        System.out.println("Index of first occurence of 10 is"  + testList.indexOf(10));
        System.out.println("Index of first last of 10 is " + testList.lastIndexOf(10));
    }
}
