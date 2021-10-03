public class ArrayList01 {
    public static void main(String[] args) {
        // Creating an ArrayList
        // Using the no-arg constructor
        List list1 = new ArrayList();

        // Using the constructor that takes initial capacity
        List list2 = new ArrayList(50);

        // Using existing Collection
        List list3 = new ArrayList(list2);

        /**
         * Adding an element
         * Since an array backs an ArrayList, the addition of an element takes O(1) time in 
         * most of the cases. It will take more time if the ArrayList is full and needs to be 
         * resized. In that scenario, a new array will be created, and elements will be copied 
         * from the old array to the new array.
         */

         /**
          * Removing an element 
          * The remove operation has O(n) complexity in the worst case and O(1) in the 
          * best case. There are two overloaded versions of the remove() method in ArrayList:
          * 
          * 1. The first one takes the index of the element that needs to be removed as input. 
          * The element can be found in O(1) time using the index, but when the element is 
          * removed, the other elements need to be moved to the left. So, if the last element 
          * is removed the complexity will be O(1) otherwise, O(n).
          *
          * 2. In the second case, the remove() method takes the element that needs to be 
          * removed as input. The array is scanned from the beginning to find the first 
          * occurrence of that element, and then it is removed. This has a complexity of O(n).
          */
    }
}
