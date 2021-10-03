public class Main {
    public static void main(String[] args) {
        // initialize
        String s1 = "Hello World";
        System.out.println("s1 is \"" + s1 + "\"");
        String s2 = s1;
        System.out.println("s2 is another reference to s1.");
        String s3 = new String(s1);
        System.out.println("s3 is a copy of s1.");
        // compare using '=='
        System.out.println("Compared by '==':");
        // true since string is immutable and s1 is binded to "Hello World"
        System.out.println("s1 and \"Hello World\": " + (s1 == "Hello World"));
        // true since s1 and s2 is the reference of the same object
        System.out.println("s1 and s2: " + (s1 == s2));
        // false since s3 is refered to another new object
        System.out.println("s1 and s3: " + (s1 == s3));
        // compare using 'equals'
        System.out.println("Compared by 'equals':");
        System.out.println("s1 and \"Hello World\": " + s1.equals("Hello World"));
        System.out.println("s1 and s2: " + s1.equals(s2));
        System.out.println("s1 and s3: " + s1.equals(s3));
        // compare using 'compareTo'
        System.out.println("Compared by 'compareTo':");
        System.out.println("s1 and \"Hello World\": " + (s1.compareTo("Hello World") == 0));
        System.out.println("s1 and s2: " + (s1.compareTo(s2) == 0));
        System.out.println("s1 and s3: " + (s1.compareTo(s3) == 0));

        /**
         * In Java, since the string is immutable, concatenation works by first allocating enough space 
         * for the new string, copy the contents from the old string and append to the new string.
         * 
         * Therefore, the time complexity in total will be:
         * 5 + 5 × 2 + 5 × 3 + … + 5 × n
         * = 5 × (1 + 2 + 3 + … + n)
         * = 5 × n × (n + 1) / 2,
         * 
         * which is O(n^2).
         */
        String str = "";
        int n = 10000;
        for (int i = 0; i < n; i++) {
            str += "hello";
        }

        // 1. If you did want your string to be mutable, you can convert it to a char array.
        String str2 = "Hello World";
        char[] str2Char = str2.toCharArray();
        str2Char[5] = ',';
        System.out.println(str);

        /**
         * 2. If you have to concatenate strings often, it will be better to use some other data 
         *    structures like StringBuilder. The below code runs in O(n) complexity.
         */ 
        int num = 10000;
        StringBuilder str3 = new StringBuilder();
        for (int i = 0; i < num; i++) {
            str3.append("hello");
        }
        String sb = str3.toString();
      
    }
}