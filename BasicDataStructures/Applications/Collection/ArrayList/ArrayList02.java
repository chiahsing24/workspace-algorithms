public class ArrayList02 {
    public static void main(String[] args) {
        // There are four ways to add elements in an ArrayList:

        /**
         * 1. Inserting a single element at the end
         * To add a single element at the end of the List, the add(E e) method can be used, where E refers to any type
         * of object. This method will check if there is sufficient capacity in the ArrayList. If the ArrayList is full,
         * then it will resize it and insert the element at the end.
         */

        /**
         * 2. Inserting a single element at a given index
         * We can also insert an element at a particular index using the add(int index, E element) method. This method
         * will insert the element at the given index and will shift the element currently at that position (if any) and
         * any subsequent elements to the right. This method will throw IndexOutOfBoundsException if the provided index
         * is less than zero or greater than the size of ArrayList.
         */

        /**
         * 3. Inserting multiple elements from another Collection
         * If we have a Collection and we need to add all its elements to another ArrayList, then the addAll(Collection c)
         * method can be used. This method will add all the elements at the end of the ArrayList.
         */
        List list1 = new ArrayList();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        System.out.println(list1);
        List list2 = new ArrayList();
        list2.addAll(list1);
        System.out.println(list2);

        /**
         * 4. Inserting multiple elements from another Collection at a particular index
         * If we have a Collection and need to add all its elements to another ArrayList at a particular index, then the
         * addAll(int index, Collection c) method can be used. This method inserts all of the specified collection
         * elements into this list, starting at the specified position. It also shifts the element currently at that
         * position (if any) and any subsequent elements to the right.
         */
        List list3 = new ArrayList(list2);
        System.out.println(list3);
        list3.addAll(3, list2);
        System.out.println(list3);

        List list4 = new ArrayList();
        list4.add(1);
        list4.add(2);
        list4.add(3);
        System.out.println(list4);

        list4.add(4);
        System.out.println(list4);

        list4.add(1, 50);
        System.out.println(list4);

        List newList = new ArrayList();
        newList.add(150);
        newList.add(160);

        list4.addAll(newList);
        System.out.println(list4);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        System.out.println("The element at index two is " + list.get(1));
        System.out.println("The size of the list is " + list.size());
    }
}
