
import java.util.*;

public class ArrayList06 {
    public static void main(String[] args) {
        /**
         * Sorting an ArrayList in ascending order
         *
         * The Collections class contains a sort(List<T> list) method, which is used to sort an ArrayList. This method
         * takes an ArrayList as input and sorts it in ascending order.
         *
         * In the sort(List<T> list) method, T represents the type of object that is stored in the ArrayList. The
         * Collections.sort(List<T> t) method takes an ArrayList of type T objects as the input. It is a must that T
         * should implement the Comparable interface; otherwise, the code will not compile.
         */
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);

        Collections.sort(list);
        System.out.println("list in asc order: " + list);

        /**
         * Sorting an ArrayList in descending order
         *
         * There is another overloaded version of the sort() method, i.e., sort(List<T> list, Comparator<? super T> c),
         * which takes a List and Comparator object as the input.
         *
         * The ArrayList can be sorted in reverse order using streams by passing Comparator.reverseOrder() to the
         * sorted() method.
         */
        List<Integer> list2 = new ArrayList<>();
        list2.add(34);
        list2.add(12);
        list2.add(9);
        list2.add(76);
        list2.add(29);
        list2.add(75);

        Collections.sort(list2, Collections.reverseOrder());
        System.out.println("list2 in desc order: " + list2);
    }
}
