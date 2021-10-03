
import java.util.*;

public class ArrayList04 {
    public static void main(String[] args) {
        // Iterating an ArrayList
        List<Integer> list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Integer i : list) {
            System.out.println(i);
        }

        /**
         * Using Iterator
         * The iterator() method in ArrayList returns an Iterator type object. The Iterator interface declares the below
         * methods that help with iterating an ArrayList.
         *
         * 1. hasNext() - This method returns true if there are more elements in the list; otherwise, it returns false.
         *
         * 2. next() - This method returns the next element in the list. Before calling next(), we should always call
         *    hasNext() to verify that there is an element; otherwise, NoSuchElementException will be thrown.
         *
         * 3. remove() - This method removes the last element returned by the iterator. It can be called only once per
         *    call to the next().
         *
         * 4. forEachRemaining(Consumer<? super E> action) - This method was introduced in Java 8. It performs the given
         *    action for each remaining element until all elements have been processed or the action throws an exception.
         *    This method’s benefit is that we do not need to check if there is a next element every time.
         */
        List<Integer> newList = new ArrayList<>();
        newList.add(10);
        newList.add(20);
        newList.add(30);
        newList.add(40);
        newList.add(50);
        newList.add(10);

        Iterator<Integer> itr = newList.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Iterating using forEachRemaining() method");
        Iterator<Integer> newItr = newList.listIterator();
        newItr.forEachRemaining(element -> System.out.println(element));

        List<Integer> toBeDeletedList = new ArrayList<>();
        toBeDeletedList.add(100);
        toBeDeletedList.add(200);
        toBeDeletedList.add(300);
        toBeDeletedList.add(400);
        toBeDeletedList.add(500);
        toBeDeletedList.add(100);

        Iterator<Integer> toBeDeletedItr = toBeDeletedList.iterator();

        while (toBeDeletedItr.hasNext()) {
            int next = toBeDeletedItr.next();

            if (next == 300) {
                toBeDeletedItr.remove();
            }
        }

        System.out.println(toBeDeletedList);
    }
}
