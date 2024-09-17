import java.util.List;

public class Rough {
    public static void main(String[] args) {
        List<String> list = new java.util.ArrayList<>(List.of("Suraj", "Pratibha", "XYZ"));

        list.forEach(System.out::println);
        list.remove(list.getLast());
        list.forEach(System.out::println);

    }
}
