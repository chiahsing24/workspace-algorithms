## Array

### Initialize an array with default values

```
Arrays.fill(count, 0);
```

## ArrayList

### Initialize an ArrayList with size of 10 and default value 100

```
ArrayList<Integer> list = new ArrayList<>(Collections.nCopies(10, 100));
```

## String

### How do you sort characters in a string?

```
String test= "edcba";
char[] ar = test.toCharArray();
Arrays.sort(ar);
String sorted = String.valueOf(ar);
```

### How to convert character array to string?

```
(ex)
char[] chars = {'a', 'p', 'p', 'l', 'e'};
String str = new String(chars);

(ex)
char[] chars = {'a', 'p', 'p', 'l', 'e'};
String str = String.valueOf(chars);

(ex)
char[] chars = {'a', 'p', 'p', 'l', 'e'};
String str = String.copyValueOf(chars);
```
