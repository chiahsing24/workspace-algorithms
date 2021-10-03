public class TreeMap02 {
    public static void main(String[] args) {
        /**
         * Fetching an element from a TreeMap#
         * The following methods can be used to fetch elements from a TreeMap.
         *
         * Fetching the value for a particular key#
         * We can fetch the value for a particular key using the get(Object o) method. This method will return the value
         * of the key if the key is present. If the key is not present, it will return null.
         *
         * Fetching the smallest key#
         * As we are aware that a TreeMap stores elements in sorted order, we can fetch the smallest key using the
         * firstKey() method. If the TreeMap is empty, then NoSuchElementException is thrown. If we want to get the
         * smallest entry, then the firstEntry() method can be used.
         *
         * Fetching the largest key#
         * We can fetch the largest key using the lastKey() method. If the TreeMap is empty, then NoSuchElementException
         * is thrown. If we want to get the largest entry, then the lastEntry() method can be used.
         */
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Oracle", 43);
        map.put("Microsoft", 56);
        map.put("Apple", 76);
        map.put("Novartis", 87);

        //Fetching the first entry in the Map.
        Entry<String, Integer> firstEntry = map.firstEntry();


        System.out.println("Smallest key: " + firstEntry.getKey() + ", Value: " + firstEntry.getValue());

        //Fetching the last entry in the Map.
        Entry<String, Integer> lastEntry = map.lastEntry();
        System.out.println("Largest key: " + lastEntry.getKey() + ", Value: " + lastEntry.getValue());

        /**
         * Removing an element from a TreeMap#
         * To remove an element from TreeMap, the remove(Object o) method can be used. This method returns the previous
         * value for this key if the key is present. If the key is not present, then null is returned.
         */
        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Oracle", 43);
        map.put("Microsoft", 56);
        map.put("Apple", 43);
        map.put("Novartis", 87);

        System.out.println("Removing Oracle from Map. This will return the value corresponding to Oracle: " + map.remove("Oracle"));
        System.out.println("Removing Google from Map. This will return null as Google is not present in the Map: " + map.remove("Google"));

        /**
         * Updating values in a TreeMap#
         * If we put a key-value pair in a TreeMap, and it is already present, then the value is updated. But what if we
         * want to update the value of a key only if it is already present in the Map? In that case, we can use the
         * replace() method provided in the TreeMap.
         *
         * It has the following two variations:
         *
         * Replacing without checking the previous value#
         * The replace(Key k, value v) method is used to replace the value of the given key. If the key is present then
         * this method replaces the old value with the new value and returns the old value. If the key is not present
         * then null is returned.
         *
         * Replacing after checking the previous value#
         * The replace(K key, V oldValue, V newValue) method is used to replace the value of the given key if its current
         * value is the same as the provided value. If the value is replaced, then true is returned. If not, then false
         * is returned.
         */
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Oracle", 43);
        map.put("Microsoft", 56);
        map.put("Apple", 76);
        map.put("Novartis", 87);

        System.out.println("Replacing the value of Oracle : " + map.replace("Oracle", 67));
        System.out.println("Latest value of Oracle : " + map.get("Oracle"));

        System.out.println("Replacing the value of Apple only if current value is 50 : " + map.replace("Apple", 50, 90));
        System.out.println("Latest value of Oracle : " + map.get("Apple"));

        System.out.println("Replacing the value of Apple only if current value is 76 : " + map.replace("Apple", 76, 90));
        System.out.println("Latest value of Oracle : " + map.get("Apple"));
    }
}
