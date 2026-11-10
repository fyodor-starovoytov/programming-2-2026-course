import net.star.java.Container;
import net.star.java.LargeContainer;

void main() {
    Container<Integer> a = new Container<>(10, "Firma Oy");
    IO.println(a); // Owner: Firma Oy, content: 10 (Integer)

    Container<Double> b = new Container<>(5.75, "Joni");
    IO.println(b); // Owner: Joni, content: 5.75 (Double)

    Container<String> c = new Container<>("Hello, world!", "Maija");
    IO.println(c); // Owner: Maija, content: Hello, world! (String)

    LargeContainer<Integer> integers = new LargeContainer<>();
    integers.add(1);
    integers.add(2);
    integers.add(3);
    integers.print(); // [1, 2, 3]
    IO.println("peek: " + integers.peek()); // 3
    IO.println(integers.contains(3)); // true
    IO.println("take: " + integers.take()); // 3
    IO.println(integers.contains(3)); // false

    IO.println();

    LargeContainer<Number> numbers = new LargeContainer<>();
    numbers.add(10);
    numbers.add(1.5);
    numbers.print(); // [10, 1.5]
    IO.println("peek: " + numbers.peek()); // 1.5
    IO.println(numbers.contains(1.5)); // true
    IO.println("take: " + numbers.take()); // 1.5
    IO.println(numbers.contains(1.5)); // false

    IO.println();

    LargeContainer<String> strings = new LargeContainer<>();
    strings.add("hello");
    strings.add("world");
    strings.print(); // [hello, world]
    IO.println("peek: " + strings.peek()); // world
    IO.println(strings.contains("world")); // true
    IO.println("take: " + strings.take()); // world
    IO.println(strings.contains("world")); // false

    IO.println();

    LargeContainer<Object> objects = new LargeContainer<>();
    objects.add(1);
    objects.add(1.5);
    objects.add("hello");
    objects.print(); // [1, 1.5, hello]
    IO.println("peek: " + objects.peek()); // hello
    IO.println(objects.contains("hello")); // true
    IO.println("take: " + objects.take()); // hello
    IO.println(objects.contains("hello")); // false

    LargeContainer<Integer> integerLargeContainer = new LargeContainer<>();
    integerLargeContainer.add(1);
    integerLargeContainer.add(2);
    integerLargeContainer.add(3);
    integerLargeContainer.print(); // [1, 2, 3]

    IO.print("Sum: ");
    IO.println(LargeContainer.sumNumbers(integerLargeContainer)); // 6.0

    LargeContainer<Double> doubles = new LargeContainer<>();
    doubles.add(1.0);
    doubles.add(2.0);
    doubles.add(3.0);
    doubles.print(); // [1.0, 2.0, 3.0]

    IO.print("Sum: ");
    IO.println(LargeContainer.sumNumbers(doubles)); // 6.0

    LargeContainer<Number> numberLargeContainer = new LargeContainer<>();
    integerLargeContainer.transferAll(numberLargeContainer);
    integerLargeContainer.print();
    doubles.transferAll(numberLargeContainer);
    numberLargeContainer.print(); // [3, 2, 1, 3.0, 2.0, 1.0]

    IO.print("Sum: ");
    IO.println(LargeContainer.sumNumbers(numberLargeContainer)); // 12.0

    LargeContainer<String> stringLargeContainer = new LargeContainer<>();
    stringLargeContainer.add("hello");
    stringLargeContainer.add("world");
    stringLargeContainer.print(); // [hello, world]
    // Strings cannot be summed because they do not inherit from Number.

    LargeContainer<Object> objectLargeContainer = new LargeContainer<>();
    numberLargeContainer.transferAll(objectLargeContainer);
    stringLargeContainer.transferAll(objectLargeContainer);
    objectLargeContainer.print(); // [1.0, 2.0, 3.0, 1, 2, 3, world, hello]
    // Objects cannot be summed because they do not inherit from Number.
}