import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Set<Integer> squareList = list.stream().map(x ->  x*x).collect(Collectors.toSet());
        System.out.println(squareList);
        List<Integer> validList = list.stream().filter(elem -> elem*elem % 2 != 0).collect(Collectors.toList());
        System.out.println(validList);
    }
}