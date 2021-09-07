import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        boxPrimitives();
        compareBoxPrimitives();
    }

    private static void boxPrimitives() {
        Integer boxedInt = Integer.valueOf(8); // static factory
        Boolean boxedBoolean = Boolean.valueOf(true);
        Character boxedCharacter = Character.valueOf('c');
        Double boxedDouble = Double.valueOf(25.5);

        System.out.println(boxedInt);
        System.out.println(boxedBoolean);
        System.out.println(boxedCharacter);
        System.out.println(boxedDouble);

        Integer boxedInt2 = Integer.valueOf("8");
        // Integer invalid = Integer.valueOf("eight"); // Invalid

        Integer boxedInt3 = new Integer(8);

        // Unwrap
        int primitiveInt = boxedInt.intValue();
        boolean primitiveBoolean = boxedBoolean.booleanValue();
        char primitiveChar = boxedCharacter.charValue();
        double primitiveDouble = boxedDouble.doubleValue();
        System.out.println();
        System.out.println(primitiveInt);
        System.out.println(primitiveBoolean);
        System.out.println(primitiveChar);
        System.out.println(primitiveDouble);

        // 1. Parsing strings: parseType
        String data = "4004	Effective Java Programming Language Guide	2007	T	4.9";
        String[] items = data.split("\t");
        long id = Long.parseLong(items[0]);
        String title = items[1];
        int pubYear = Integer.parseInt(items[2]);
        char genre = items[3].charAt(0);
        double rating = Double.parseDouble(items[4]);

        System.out.println();
        System.out.println("id: " + id);
        System.out.println("title: " + title);
        System.out.println("pubYear: " + pubYear);
        System.out.println("genre: " + genre);
        System.out.println("rating: " + rating);

        // 2. MIN_VALUE & MAX_VALUE

        // 3. utility method
        boolean isLetter = Character.isLetter(genre);
        boolean isDigit = Character.isDigit(genre);
        boolean isLetterOrDigit = Character.isLetterOrDigit(genre);
        boolean isUpperCase = Character.isUpperCase(genre);

        System.out.println();
        System.out.println(isLetter);
        System.out.println(isDigit);
        System.out.println(isLetterOrDigit);
        System.out.println(isUpperCase);

        System.out.println();
        boolean isNan = Double.isNaN(0.0/0.0);
        System.out.println(isNan);

        System.out.println();
        String binary = Integer.toBinaryString(8);
        System.out.println(binary);
        String pubYearAsString = Integer.toString(pubYear);

        // Populate data structure
        ArrayList idList = new ArrayList();
        idList.add(Long.valueOf(id));
        idList.add(id); // Java 5 - auto-boxing

        // Generics - parameterized types
        ArrayList<Double> ratingList = new ArrayList<>();
    }

    static void compareBoxPrimitives() {
        System.out.println("\nInside compareBoxPrimitives ...");
        Integer num1 = new Integer(0);
        Integer num2 = new Integer(0);
        System.out.println("(num1 == num2): " + (num1 == num2));

        // Solutions:
        System.out.println("(num1.intValue() == num2.intValue()): " + (num1.intValue() == num2.intValue()));
        System.out.println("(num1.equals(num2)): " + (num1.equals(num2)));

        Integer num3 = new Integer(1);
        System.out.println("(num1 < num3): " + (num1 < num3)); // "<" does un-boxing first
    }
}
