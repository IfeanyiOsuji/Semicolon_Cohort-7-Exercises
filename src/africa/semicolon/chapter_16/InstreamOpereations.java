package africa.semicolon.chapter_16;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InstreamOpereations {
    // A lambda's lexical scope is the scope of the enclosing method.
    //A local variable that the lambda references in its lexical scope must be final. Such a variable either can be declared
    // final or is effectively final
    public static void main(String[] args) {
        int [] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
        // display original values
        System.out.print("Original values: ");
        System.out.println(
                IntStream.of(values)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" "))
        );
        System.out.println(IntStream.of(values).summaryStatistics());
    }

}
